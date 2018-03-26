package com.yao.ws.service;


import com.alibaba.fastjson.JSON;

import javax.jws.WebService;
import java.util.Map;

/**
 * Created by shanyao on 2018/3/24.
 */
@WebService(serviceName ="hello", endpointInterface = "com.yao.ws.service.HelloWorld")
public class HellowWorldImpl implements HelloWorld{
    public String sayHi(String param) {
        System.out.println("get psot data:" + param);
        Map map = JSON.parseObject(param);

        return "Hello " + map.get("a");
    }
}
