package com.ming.service;

import com.ming.service.impl.UserServiceImpl;

/**
 * @author liuming
 * @description
 * @date 2022/7/12
 */
public class UserServiceFactory2 {

    public UserService getService(){
        System.out.println("非静态注册");
        return new UserServiceImpl();
    }
}
