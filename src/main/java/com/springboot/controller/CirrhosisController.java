package com.springboot.controller;

import com.springboot.ModelNew.CirrhosisNew;
import com.springboot.ModelOld.CirrhosisOld;
import com.springboot.service.CirrhosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
//主键
@Controller
@RequestMapping(value = "/cirrhosis")
public class CirrhosisController {
    @Resource
    private CirrhosisService cirrhosisService;
    @RequestMapping("/all")
    @ResponseBody
    public List<CirrhosisOld> Cirrhosis() {
       List<CirrhosisOld> mapList =  cirrhosisService.GetCirrhosis();
     //  System.out.println(mapList);
       return mapList;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert() {
        try{
            List<CirrhosisOld> oldcir = cirrhosisService.GetCirrhosis();
            for (CirrhosisOld cirrhosisNew:oldcir
                    ) {
                System.out.println(cirrhosisNew);
            }
            List<CirrhosisNew> list= cirrhosisService.upCirrhosisls(oldcir);
            for (CirrhosisNew cirrhosisNew:list
                    ) {
                System.out.println(cirrhosisNew);
                cirrhosisService.insertCirrhosis(cirrhosisNew);
            }
         return true;

        } catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }


}
