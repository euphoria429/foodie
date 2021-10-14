package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 〈启动类〉<br>
 *
 * @author huangcaixia
 * @create 2021-10-14 15:46
 * @since 1.0.0
 */

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
