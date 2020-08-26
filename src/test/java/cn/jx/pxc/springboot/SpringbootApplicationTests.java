package cn.jx.pxc.springboot;

import cn.jx.pxc.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        /**记录器
         * 日志的级别由低到高：trace<debug<info<warn<error
         * 可以自己调整输出日志的级别，日志就只会在这个级别以及比这个高的级别生效
         * springboot默认的日志级别是info级别,没有指定日志级别就使用springboot的默认日志级别，root级别
         * spring
         * */
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.trace("这是trace日志......");
        logger.debug("这是debug日志......");
        logger.info("这是info日志.......");
        logger.warn("这是warn日志.......");
        logger.error("这是error日志......");
        //System.out.println(person);
    }

}
