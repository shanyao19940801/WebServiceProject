package com.yao.ws.service;

import com.yao.ws.entity.User;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by shanyao on 2018/3/24.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IUserService {
    public void setUser(User user);
}
