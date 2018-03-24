package com.yao.ws.service.Impl;

import com.yao.ws.entity.User;
import com.yao.ws.service.IUserService;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by shanyao on 2018/3/24.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class UserServiceImpl implements IUserService {
    public void setUser(User user) {
        System.out.println(user);
    }
}
