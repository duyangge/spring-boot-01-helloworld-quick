package cn.jx.pxc.springboot.service;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.sun.org.apache.regexp.internal.RE;

import java.util.Date;

/**
 * 功能简述:
 *
 * @author 23801
 * @version 1.0.0
 * @create 2020/8/14
 * @Date 2020/8/14 21:04
 */
public class HelloService {

    /**
     *使用HuTool工具集中的DateUtil格式转换
     * @return
     * @author
     * @date
     *
     */
    public  String  getHello(){
       StringBuilder stringBuilder = new StringBuilder("Hello,welcome to you !");
       stringBuilder.append(DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
       return stringBuilder.toString();
    }
}
