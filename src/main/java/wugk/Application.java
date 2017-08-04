package wugk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by WUGUOKAI on 2017/8/4.
 */
@Configuration//指出该类是Bean的实体类，相当于xml的<beans></beans>,一般加在主类上
@EnableAutoConfiguration
@ComponentScan
@EnableTransactionManagement
public class Application {
    public static void main(String[] args ){
        SpringApplication.run(Application.class, args);
    }
}
