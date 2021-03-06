package com.ming.dao.impl;

import com.ming.dao.BookDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

/**
 * @author liuming
 * @description
 * @date 2022/7/12
 */
public class BookDaoImpl implements BookDao {

    private ArrayList al;
    private Properties properties;
    private int[] arr;
    private HashSet hs;
    private HashMap hm;
    private int num;

    public void setNum(int num){
        this.num = num;
    }

    public void setAl(ArrayList al){
        this.al = al;
    }
    public void setProperties(Properties properties){
        this.properties = properties;
    }
    public void setArr(int[] arr){
        this.arr = arr;
    }
    public void setHs(HashSet hs){
        this.hs = hs;
    }
    public void setHm(HashMap hm) {
        this.hm = hm;
    }
    @Override
    public void save() {
        System.out.println("book dao is running");
        System.out.println("ArrayList: " + al);
        System.out.println("Properties:" + properties);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("HashSet:" + hs);
        System.out.println("HashMap:" + hm);
    }
}
