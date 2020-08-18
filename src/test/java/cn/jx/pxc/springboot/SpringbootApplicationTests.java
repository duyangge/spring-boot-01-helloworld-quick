package cn.jx.pxc.springboot;

import cn.jx.pxc.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * 测试模块
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    ApplicationContext ioc;

    @Autowired
    Person person;

    /**
     *测试在spring容器中加载自己编写的类两种方式；springboot 推荐给容器添加组件的方式，不推荐编写spring的配置文件
     * 第一种：编写配置文件导入，@ImportResource不推荐
     * 第二种：编写spring配置类，推荐以u添加组件的方式
     *
     *
     */
    @Test
    void tellHelloService(){
        boolean flag = ioc.containsBean("getHelloService");
        System.out.println(flag);
    }

    /**
     * 测试使用配置注入bean类属性值
     *
     */
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
