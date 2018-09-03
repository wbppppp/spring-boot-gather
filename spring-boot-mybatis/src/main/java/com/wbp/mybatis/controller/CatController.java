package com.wbp.mybatis.controller;

import com.wbp.mybatis.pojo.Cat;
import com.wbp.mybatis.service.CatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/10 0010.
 */
@Controller
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/findByName")
    @ResponseBody
    public List<Cat> findByName(Cat cat){

        List<Cat> cats = catService.findByName(cat.getName());
        return cats;
    }

    @RequestMapping("/save")
    @ResponseBody
    public Cat save(Cat cat){
        catService.save(cat);
        return cat;
    }


    @RequestMapping("/hello")
    public ModelAndView helloFtl(Map map){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("name","Andy");
        return modelAndView;
    }


}
