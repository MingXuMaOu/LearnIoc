package com.ming.service;

import com.ming.service.impl.UserServiceImpl;

/**
 * @author liuming
 * @description
 * @date 2022/7/12
 */
public class UserServiceFactory {
    public static UserService getService(){
        System.out.println("静态方法注册");
        return new UserServiceImpl();
    }
}
