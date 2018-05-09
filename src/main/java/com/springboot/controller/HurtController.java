package com.springboot.controller;

import com.springboot.ModelOld.HurtOld;
import com.springboot.service.HurtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/hurt")
public class HurtController {
    @Autowired
    private HurtService hurtService;
    @RequestMapping(value = "/all")
    @ResponseBody
    public List<HurtOld> hurt(){
        List<HurtOld> list = hurtService.GetHurt();
        return list;
    }
}
