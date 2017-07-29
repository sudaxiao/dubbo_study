package com.dfire.controller;

import com.dfire.entity.Admin;
import com.dfire.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ch on 2017/7/15.
 */
@Controller
@RequestMapping("/")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @PostMapping("/admin/login")
    public String login(HttpServletRequest request, Admin admin){
/*        System.out.println(admin);
        System.out.println(adminService.checkAdmin(admin));*//*        System.out.println(admin);
        System.out.println(adminService.checkAdmin(admin));*/
        if(adminService.checkAdmin(admin)>0){
            request.getSession().setAttribute("username",admin.getUsername());

            return "redirect:/user/table";
        }else{
            return "redirect:/login";
        }
    }
}
