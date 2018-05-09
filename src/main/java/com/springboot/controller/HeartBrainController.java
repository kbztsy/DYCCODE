package com.springboot.controller;

import com.springboot.ModelOld.HeartBrainOld;
import com.springboot.service.HeartBrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/heartbrain")
public class HeartBrainController {
    @Autowired
    private HeartBrainService heartBrainService;

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<HeartBrainOld> heartbrain(){
        List<HeartBrainOld> list = heartBrainService.GetHeartBrain();
        return list;
    }
}
