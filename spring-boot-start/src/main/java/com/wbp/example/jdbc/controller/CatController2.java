package com.wbp.example.jdbc.controller;


import com.wbp.example.jdbc.service.CatService2;
import com.wbp.example.jpa.pojo.Cat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@RestController
public class CatController2 {

    @Resource
    private CatService2 catService2;

    @RequestMapping("selectByName")
    public Cat selectByName(Cat cat){
        Cat ca = catService2.selectCatByName(cat.getName());
        return  ca;
    }




}
