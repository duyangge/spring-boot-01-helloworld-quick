package cn.jx.pxc.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import cn.jx.pxc.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能简述:
 *
 * @RestController相当于@ResponseBody + @Controller
 * @author 23801
 * @version 1.0.0
 * @create 2020/8/9
 * @Date 2020/8/9 20:21
 */

@RestController
public class HelloController {

    @Autowired
    private HelloService getHelloService;

    @RequestMapping("/hello")
    public String show(){
        return "hello,springboot-quick,"+getHelloService.getHello();
    }
}
