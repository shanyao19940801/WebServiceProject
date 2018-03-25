package com.yao.ws.service;

import javax.jws.WebService;
import javax.servlet.jsp.tagext.PageData;

/**
 * Created by shanyao on 2018/3/24.
 */
@WebService
public interface HelloWorld {
    String sayHi(PageData pageData);
}
