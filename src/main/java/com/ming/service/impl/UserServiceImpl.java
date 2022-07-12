package com.ming.service.impl;

import com.ming.dao.BookDao;
import com.ming.dao.UserDao;
import com.ming.dao.impl.UserDaoImpl;
import com.ming.service.UserService;

/**
 * @author liuming
 * @description
 * @date 2022/7/12
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private BookDao bookDao;
    private int num;
    private String version;

    public UserServiceImpl(){

    }
    public UserServiceImpl(UserDao userDao,int num,String version){
        this.userDao = userDao;
        this.num = num;
        this.version = version;
    }

    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }

    public void setVersion(String version){
        this.version = version;
    }

    public void setNum(int num){
        this.num = num;
    }
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("user service running..." + num + "  " + version);
        userDao.save();
        bookDao.save();
    }

    public void init(){
        System.out.println("初始化");
    }

    public void destroy(){
        System.out.println("销毁");
    }


}
