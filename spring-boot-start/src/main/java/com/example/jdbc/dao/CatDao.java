package com.example.jdbc.dao;

import com.example.jpa.pojo.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/6/13 0013.
 */
@Repository
public class CatDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Cat selectCatByName(String name){

        String sql = "select * from cat where name=?";

        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);

        Cat cat = jdbcTemplate.queryForObject(sql,new Object[]{name},rowMapper);

        return cat;
    }

}
