package com.yao.ws.service;

import javax.jws.WebService;

/**
 * Created by shanyao on 2018/3/24.
 */
@WebService(serviceName ="hello", endpointInterface = "com.yao.ws.service.HelloWorld")
public class HellowWorldImpl {
    public String sayHi(String text) {
        System.out.println("SayHi called");
        return "Hello " + text;
    }
}
