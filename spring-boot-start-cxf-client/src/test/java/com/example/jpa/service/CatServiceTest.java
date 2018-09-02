package com.example.jpa.service;

import com.example.jpa.pojo.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by Administrator on 2018/8/1 0001.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CatServiceTest {

    @Autowired
    private CatService catService;

    @Test
    public void findByName() throws Exception {
        Cat cat = catService.findByName("李四");
        Assert.assertEquals("错误信息提示","sss",cat.getName());
    }
}