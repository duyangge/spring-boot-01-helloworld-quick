package cn.jx.pxc.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能简述:
 *
 * @author 23801
 * @version 1.0.0
 * @create 2020/8/9
 * @Date 2020/8/9 20:21
 */
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String show(){
        return "hello,springboot-quick";
    }
}
