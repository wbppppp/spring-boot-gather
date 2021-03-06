package com.wbp.example.jpa.controller;

import com.wbp.example.App;
import com.wbp.example.jpa.pojo.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/8/1 0001.
 */

@RunWith(SpringRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebIntegrationTest(value = {"server.port=8888"})
public class CatControllerTest2 {

    @Test
    public void findByName() throws Exception {

        RestTemplate rest = new RestTemplate();

        Cat c = rest.getForObject("http://localhost:8888/findByName?name=李四", Cat.class);

        System.out.println(c);

        Assert.assertEquals("错误","李四",c.getName());

    }
}