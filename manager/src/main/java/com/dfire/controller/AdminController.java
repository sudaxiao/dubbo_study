package com.dfire.controller;

import com.dfire.authorization.UnCheckLogin;
import com.dfire.entity.Admin;
import com.dfire.service.AdminService;
import com.twodfire.redis.ICacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ch on 2017/7/15.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private ICacheService iCacheService;
    @PostMapping("/login")
    @UnCheckLogin
    public String login(HttpServletRequest request, Admin admin){
        if(adminService.checkAdmin(admin)>0){
            iCacheService.setObject("username",admin.getUsername(),2*60*60);
            return "redirect:/user/table";
        }else{
            return "redirect:/login";
        }
    }
}
