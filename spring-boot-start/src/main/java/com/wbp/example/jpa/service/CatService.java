package com.wbp.example.jpa.service;

import com.wbp.example.jpa.pojo.Cat;
import com.wbp.example.jpa.repository.CatRepository;
import com.wbp.example.jpa.repository.CatRepository2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Resource
    private CatRepository2 catRepository2;

    @Transactional
    public void save(Cat cat){

        catRepository.save(cat);
    }

    @Transactional
    public void delete(Integer id){

        catRepository.delete(id);
    }

    public Iterable<Cat> getAll(){
        Iterable<Cat> all = catRepository.findAll();
        return all;
    }

    public Cat findByName(String name){
        Cat cat = catRepository2.findByName(name);
        return cat;
    }

}
