package com.springboot.controller;


import com.springboot.ModelOld.AIDSOld;
import com.springboot.ModelOld.HurtOld;
import com.springboot.service.AIDSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/aids")
public class AIDSController {
    @Autowired
    private AIDSService aidsService;
    @Autowired

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<HurtOld> aids(){
        List<HurtOld> maps = aidsService.GetAIDS();
        return maps;
    }


}
