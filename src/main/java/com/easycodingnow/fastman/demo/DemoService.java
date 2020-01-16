package com.easycodingnow.fastman.demo;

/**
 * @author lihao
 * @since 2020-01-16
 */
public interface DemoService {

    /**
     * @test
     * [
     *  {"a":null, "b":1, "c":1.2, "d":2.3},
     *  "2"
     * ]
     */
    public Object test(DemoRequest demoRequest, String a);
}
