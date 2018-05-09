package com.springboot.controller;

import com.springboot.ModelOld.CirrhosisOld;
import com.springboot.service.CirrhosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/cirrhosis")
public class CirrhosisController {
    @Autowired
    private CirrhosisService cirrhosisService;
    @RequestMapping("/all")
    @ResponseBody
    public List<CirrhosisOld> Cirrhosis() {
       List<CirrhosisOld> mapList =  cirrhosisService.GetCirrhosis();
       System.out.println(mapList);
       return mapList;
    }
}
