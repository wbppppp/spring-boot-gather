package com.example.jpa.repository;

import com.example.jpa.pojo.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Administrator on 2018/6/13 0013.
 */
public interface CatRepository2 extends PagingAndSortingRepository<Cat,Integer> {


    /**
     * 1.查询方法以get,find,read开头
     * 2.涉及到属性查询时，用关键字连接，同时注意条件属性首字母大写
     *
     * @return
     */
    public Cat findByName(String name);

    @Query("from Cat where name=:cn")
    public Cat findMyCatByName(@Param("cn") String name);


}
