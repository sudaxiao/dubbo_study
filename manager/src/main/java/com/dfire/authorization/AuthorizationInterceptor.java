package com.dfire.authorization;

import com.twodfire.redis.ICacheService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by ch on 2017/7/15.
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private ICacheService iCacheService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURL().toString();
        if (StringUtils.contains(url, "static") || StringUtils.endsWith(url, "/login"))
            return true;

        if(!(handler instanceof HandlerMethod)){
            return true;
        }
        HandlerMethod handlerMethod= (HandlerMethod) handler;
        UnCheckLogin methodAnnotation =handlerMethod.getMethodAnnotation(UnCheckLogin.class);
        UnCheckLogin classAnnotation=handlerMethod.getBeanType().getDeclaredAnnotation(UnCheckLogin.class);
        //类或者方法上都没有UnCheckLogin注解就要验证登录
        if(methodAnnotation==null||classAnnotation==null){
            boolean isAllow=checkLogin(request,response);
            if(isAllow){
               return true;
            }
        }
        response.sendRedirect("/login");
        return false;
    }

    private boolean checkLogin(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        String username = (String) iCacheService.getObject("username");
        return username != null;
    }
}
