package springmvc20180818.controller;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Emma on 2018/8/18.
 */
/*
* 拦截器
* */
public class ReqInterrupt extends HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String value=request.getHeader("login");//
        return super.preHandle(request, response, handler);
    }

}
