package com.ming;

import com.ming.dao.impl.BookDaoImpl;
import com.ming.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liuming
 * @description
 * @date 2022/7/12
 */
public class UserApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml","applicationContext-book.xml");

//        UserService userService = (UserService) ctx.getBean("userService1");
//        UserService userService1 = (UserService)ctx.getBean("userService1");
//        System.out.println(userService1 == userService);

//        UserService userService = (UserService)ctx.getBean("userService");


//        userService.save();
        BookDaoImpl bookDao = (BookDaoImpl) ctx.getBean("bookDao1");
        bookDao.save();
    }
}
