package com.yao.ws.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.servlet.jsp.tagext.PageData;

/**
 * Created by shanyao on 2018/3/24.
 */
@WebService(serviceName ="hello", endpointInterface = "com.yao.ws.service.HelloWorld")
public class HellowWorldImpl implements HelloWorld{
    public String sayHi(@WebParam(partName = "pd") PageData pd) {
        System.out.println("SayHi called");
        return "Hello " + pd;
    }
}
