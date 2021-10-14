package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author huangcaixia
 * @create 2021-10-14 15:49
 * @since 1.0.0
 */
//@Controller mvc用的多
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello(){
        return "Hello World";
    }
}
