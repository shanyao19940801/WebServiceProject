package com.yao.ws.client;

import com.yao.ws.entity.User;
import com.yao.ws.service.IUserService;
import com.yao.ws.util.CxfInvokeUtil;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by shanyao on 2018/3/24.
 */
public class WebServiceClient {
    public static void main(String[] args) {
//        client1();
//        invokeMethod();
        String url = "http://localhost:8088/services/HelloWorld?wsdl";
        String method = "sayHi";
        try {
            Object result = CxfInvokeUtil.invoke(url,method);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void invokeMethod() {
        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = (Client) clientFactory.createClient("http://localhost:8088/services/HelloWorld?wsdl");
        // invoke 第一个参数为要调用的webservices的方法，后面参数为方法入参（对应方法的参数）
        Object[] result = new Object[0];
        try {
            result = client.invoke("sayHi","shanyao");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result[0]);
    }

    private static void client1() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(IUserService.class);
        factory.setAddress("http://localhost:8088/services/Users");

        IUserService service = (IUserService) factory.create();
        User user = new User();
        user.setName("shanyao");
        service.setUser(user);
    }


}
