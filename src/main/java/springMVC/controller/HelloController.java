package springMVC.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Emma on 2018/8/17.
 */
@Controller("/web")//一般习惯有个父级地址
public class HelloController {
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, HttpServletResponse response){
        System.out.println("hello");
        return "hello";
    }
}
