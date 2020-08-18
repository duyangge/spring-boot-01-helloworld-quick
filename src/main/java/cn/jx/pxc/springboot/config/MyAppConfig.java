package cn.jx.pxc.springboot.config;

import cn.jx.pxc.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能简述:
 *
 * @author 23801
 * @version 1.0.0
 * @create 2020/8/14
 * @Date 2020/8/14 21:19
 */

/**
 *@Configuration:就是指明当前类是一个配置类，就是替代之前的spring配置文件的e
 * 在配置文件中<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {
    /**
     * 将方法的返回值添加到容器中；容器中的这个组建的默认id就是方法名
     * @return
     */
    @Bean
    public HelloService getHelloService(){
        System.out.println("配置类@Bean给容器中添加组件了");
        return new HelloService();
    }
}
