package com.dfire.controller;

import com.dfire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ch on 2017/7/12.
 */
@RestController
@RequestMapping("/")
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping("{page}")
    public ModelAndView toPage(@PathVariable("page") String page){
        ModelAndView mv=new ModelAndView(page);
        if(page!=null&&"table".equals(page)){
            mv.addObject("users",userService.selectAll());
        }
        return mv;
    }
}
