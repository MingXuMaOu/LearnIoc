package com.ming.dao.impl;

import com.ming.dao.UserDao;

/**
 * @author liuming
 * @description
 * @date 2022/7/12
 */
public class UserDaoImpl implements UserDao {

    private String username;
    private String pwd;
    private String driver;

    public UserDaoImpl(){

    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPwd(String pwd){
        this.pwd = pwd;
    }

    public UserDaoImpl(String driver,String username,String pwd){
        this.driver = driver;
        this.username = username;
        this.pwd = pwd;
    }

    @Override
    public void save() {
        System.out.println("user dao running..." + username + "  " + pwd + "  " + driver);
    }
}
