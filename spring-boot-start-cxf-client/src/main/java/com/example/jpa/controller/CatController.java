package com.example.jpa.controller;

import com.example.jpa.pojo.Cat;
import com.example.jpa.repository.CatRepository2;
import com.example.jpa.service.CatService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@RestController
public class CatController {

    @Resource
    private CatService catService;

    @Resource
    private CatRepository2 catRepository2;

    @RequestMapping("/save")
    public Cat save(){
        Cat cat = new Cat("张三",12);
        catService.save(cat);
        return cat;
    }

    @RequestMapping("/delete")
    public String delete(int id){
        catService.delete(id);
        return  "success";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }

    @RequestMapping("/findByName")
    public Cat findByName(Cat cat){
        System.out.println("传参--》" + cat.getName());
        Cat c = catService.findByName(cat.getName());
        return c;
    }

    @RequestMapping("/findByName2")
    public Cat findByName2(Cat cat){
        Cat c = catRepository2.findMyCatByName(cat.getName());
        return c;
    }


    /**
     * PagingAndSortingRepository: 分页 && 排序
     *
     *      问题：
     *          1.page代表是当前页，执行sql时是查询下一页（page+1）的size条记录
     *          2.sort排序，它是先对所有数据排序，然后在查询数据，不是先查询后排序
     *
     */
    @RequestMapping("pagingAndsorting")
    public List<Cat> pagingAndsorting(Integer page,Integer size){

        Order order = new Order(Sort.Direction.DESC,"id");
        System.out.println(page + "-->" + size );
        Sort sort = new Sort(order);
        PageRequest pageRequest = new PageRequest(page,size,sort);

        Page<Cat> all = catRepository2.findAll(pageRequest);

        List<Cat> content = all.getContent();
        return content;

    }


}
