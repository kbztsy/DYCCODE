package com.springboot.controller;

import com.springboot.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class demo {
    @Autowired
    private DemoService demoService;


    @RequestMapping(value = "/index")
    public String index(){
    return "index";
    }

    @RequestMapping(value = "/index1",method = RequestMethod.POST)
    @ResponseBody
    public void index1(){
       List<Map> map1 =  demoService.All1();
       System.out.println(map1);
       List<Map> map2 =  demoService.All2();
       System.out.println(map2);

    }

}
