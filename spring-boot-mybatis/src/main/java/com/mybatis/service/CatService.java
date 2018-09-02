package com.mybatis.service;

import com.github.pagehelper.PageHelper;
import com.mybatis.mapper.CatMapper;
import com.mybatis.pojo.Cat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@Service
public class CatService {

    @Resource
    private CatMapper catMapper;


    public List<Cat> findByName(String name){
        PageHelper.startPage(1,1);
        List<Cat> cats = catMapper.likeName(name);
        return cats;
    }

    @Transactional
    public void save(Cat cat){
        catMapper.save(cat);
    }

}
