package com.wbp.example.jpa.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/8/1 0001.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CatControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void findByName() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/findByName").param("name","李四"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }
}