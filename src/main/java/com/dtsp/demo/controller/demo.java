package com.dtsp.demo.controller;

import com.dtsp.demo.service.IRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018-04-27.
 */
@Controller
@EnableAutoConfiguration
public class demo {
    @Autowired
    private IRegService regService;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/reg")
    @ResponseBody
    Boolean reg(@RequestParam("t1") String t1, @RequestParam("t2") String t2) {
        System.out.println(t1 + "+" + t2);
        boolean bol = regService.regUser(t1, t2);
        return bol;
    }
}
