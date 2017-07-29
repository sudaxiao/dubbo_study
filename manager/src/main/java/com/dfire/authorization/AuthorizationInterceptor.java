package com.dfire.authorization;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by ch on 2017/7/15.
 */
public class AuthorizationInterceptor  extends HandlerInterceptorAdapter{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(checkLogin(request,response)){
            return true;
        }else{
            response.sendRedirect("/login");
            return false;
        }
    }

    private boolean checkLogin(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
        String username= (String) request.getSession().getAttribute("username");
        return username!=null;
    }
}
