package com.wbp.example.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Administrator on 2018/6/17 0017.
 */
@Controller
@RequestMapping("/ftl")
public class TemplateController {

    @RequestMapping("/hello")
    public String helloFtl(Map map){
        map.put("name","Andy");
        return "index";
    }

    @RequestMapping("/hello2")
    public ModelAndView helloFtl2(Map map){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("name","Andy");
        return modelAndView;
    }

}
