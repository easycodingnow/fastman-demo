package com.easycodingnow.fastman.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lihao
 * @since 2020-01-16
 */
@Controller
public class DemoController {


    /**
     * @test ["1212"]
     * @param test
     * @return
     */
    @GetMapping("test")
    public Object test(String test){
        return  test;
    }
}
