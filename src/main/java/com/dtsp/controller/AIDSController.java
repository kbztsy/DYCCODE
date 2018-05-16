package com.dtsp.controller;


import com.dtsp.ModelOld.HurtOld;
import com.dtsp.service.AIDSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/aids")
public class AIDSController {
    @Autowired
    private AIDSService aidsService;
    @RequestMapping(value = "/all")
    @ResponseBody
    public List<HurtOld> aids() {
        List<HurtOld> maps = aidsService.GetAIDS();
        return maps;
    }
}
