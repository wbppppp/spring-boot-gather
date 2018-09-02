package com.example.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2018/6/17 0017.
 */
@Controller
@RequestMapping("/jsp")
public class JSPController {

    @RequestMapping("/jsp")
    public ModelAndView jsp(){


        ModelAndView modelAndView = new ModelAndView("testJsp");
        return modelAndView;
    }

    @RequestMapping("/jsp1")
    public String jsp1(){
        return "testJsp";
    }
}
