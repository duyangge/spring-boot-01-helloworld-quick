package cn.jx.pxc.springboot.bean;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 功能简述:
 *@configurationProperties:告诉springboot将本类的属性与配置文件中相关的配置进行绑定；
 * prefix = "person" :配置文件中哪个下面的所有属性进行一一映射
 * 只有这个组件是容器的组件，才能使用容器提供的@ConfigurationProperties功能，因此加入@Component
 * @ConfigutationProperties（prefix="person"）默认从全局配置文件获取值；
 * @PropertySource(value={"classpath:person.properties"}):加载指定路径下的配置文件
 * @author 23801
 * @version 1.0.0
 * @create 2020/8/9
 * @Date 2020/8/9 22:21
 */

/**
 * <bean class="pserson" >
 *     第一种：
 *    <property name="username" value="字面量"></property>
 *    第二种：从环境变量或者配置文件
 *    <property name="username" value="${key}"></property>
 *    第三种：使用spEL表达式赋值
 *    <property name="username" value="#{spEL}"></property>
 * </bean>
 * 同理，@Value()也一样支持
 * 注意：使用@PropertySource与@ConfigurationProperties一起使用；
 *  @ConfigurationProperties(prefix = “person”)表示该类的属性值为配置中的属性值，
 *  找前缀为person的属性。首先从全局配置文件中找是否有person对应的属性值，
 *  如果有那么就输出全局配置中的属性值；如果没有，@PropertySource意思是属性来源，
 *  从@PropertySource指定的路径中找到对应的配置文件，进行赋值。
 *
 */

@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")//将配置文件中配置的每一个属性的值都映射到这个组件中,快速动态绑定
//@Validated
@Data
public class Person {

    //@Value("${person.username}")
   // @NotNull  //username不为空 @Value不支持@Validated，@ConfigurationProperties支持
    private  String username;
    //@Value("#{11*2}")
    private  Integer age;
    // @Value("false")
    private Boolean boss;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

}
