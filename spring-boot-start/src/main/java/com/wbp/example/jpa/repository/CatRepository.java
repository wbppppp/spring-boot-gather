package com.wbp.example.jpa.repository;

import com.wbp.example.jpa.pojo.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
public interface CatRepository extends CrudRepository<Cat,Integer> {


}
