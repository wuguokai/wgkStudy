package wugk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by WUGUOKAI on 2017/8/4.
 */
@Configuration          //指出该类是Bean的实体类，相当于xml的<beans></beans>,一般加在主类上
@EnableAutoConfiguration//让 SpringBoot 根据应用所声明的依赖来对 Spring 框架进行自动配置，
                        // 由于 spring-boot-starter-web 添加了Tomcat和Spring MVC，
                        // 所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置
@ComponentScan          //表示将该类自动发现（扫描）并注册为Bean，可以自动收集所有的Spring组件
                        // （@Component , @Service , @Repository , @Controller 等），包括@Configuration类。
@EnableTransactionManagement//启用注解式事务。
//@SpringBootApplication// @EnableAutoConfiguration、@ComponentScan和@Configuration的合集。
public class Application {
    public static void main(String[] args ){
        SpringApplication.run(Application.class, args);
    }
}
