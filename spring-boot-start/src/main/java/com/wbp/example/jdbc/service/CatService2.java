package com.wbp.example.jdbc.service;

import com.wbp.example.jdbc.dao.CatDao;
import com.wbp.example.jpa.pojo.Cat;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@Service
public class CatService2 {


    @Resource
    public CatDao catDao;

    public Cat selectCatByName(String name){
        Cat cat = catDao.selectCatByName(name);
        return cat;
    }

}
