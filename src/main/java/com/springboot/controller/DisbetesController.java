package com.springboot.controller;


import com.springboot.ModelOld.DiabetesOld;
import com.springboot.service.DisbetesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/disbetes")
public class DisbetesController {
    @Autowired
    private DisbetesService disbetesService;

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<DiabetesOld> GetDisbetes(){
        List<DiabetesOld> mapList = disbetesService.GetDisbetes();
        return mapList;
    }


}
