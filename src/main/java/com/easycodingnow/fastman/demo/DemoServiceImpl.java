package com.easycodingnow.fastman.demo;

import org.springframework.stereotype.Service;

/**
 * @author lihao
 * @since 2020-01-16
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public Object test(DemoRequest demoRequest, String a) {
        return "我是返回值";
    }


}
