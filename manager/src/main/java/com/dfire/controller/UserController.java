package com.dfire.controller;

import com.dfire.entity.User;
import com.dfire.entity.result_entity.UserResult;
import com.dfire.service.UserService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ch on 2017/7/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Deprecated
    @RequestMapping("/show")
    public List<User> getAll(){
        return userService.selectAll();
    }

    /**
     * 用户在表格的显示
     * @return
     */
    @RequestMapping("/table")
    public ModelAndView toIndex(){
        ModelAndView mv=new ModelAndView("table");
        List<User> users=userService.selectAll();
        mv.addObject("users",users);
        return mv;
    }

    /**
     * 用户更新回显
     * @param id
     * @return
     */
    @RequestMapping("/edit/{id}")
    public ModelAndView editUser(@PathVariable(value = "id") Integer id){
        ModelAndView mv=new ModelAndView("edit");
        User user=userService.selectByPrimaryKey(id);
        mv.addObject("user",user);
        return mv;
    }

    /**
     * 由于新增和修改是同一个页面  所以需要new一个空的对象  避免thymeleaf报错
     * @return
     */
    @RequestMapping("/add/edit")
    public ModelAndView editAndAdd(){
        ModelAndView mv=new ModelAndView("edit");
        User user=new User();
        mv.addObject("user",user);
        return mv;
    }

    /**
     * 根据user.id来判断用户是否已经存在于数据库中
     * 如果存在：更新
     * 如果不存在：添加
     * tip:不会存在主键冲突问题  因为我的新增页面并没有设置id
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public String update(User user){
        if(user.getId()!=null)
            userService.update(user);
        else
            userService.insert(user);
        return "redirect:/table";
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        userService.deleteByPrimaryKey(id);
        return "redirect:/table";
    }

    /**
     *  根据客户端传递的选项来建立不同的图表
     * @param field 建立图表的选项
     * @return
     */
    @GetMapping("/chart/{field}")
    public ModelAndView showChart(@PathVariable("field") String field){
        ModelAndView mv=new ModelAndView("mychart");
        if(field==null) return mv;
        List<UserResult> userResults=null;
        if("sex".equals(field)){
            userResults = userService.groupBySex();
            mv.addObject("title","性别分布");
        }else if("age".equals(field)){
            userResults = userService.groupByAge();
            mv.addObject("title","年龄分布");
        }
        mv.addObject("userResults",userResults);
        return mv;
    }

}
