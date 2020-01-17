package com.easycodingnow.fastman.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lihao
 */
@Controller
public class DemoController {


    /**
     * @test ["testavc"]
     * @param test
     * @return
     */
    @GetMapping("test")
    public Object test(String test){
        return  test;
    }

}
