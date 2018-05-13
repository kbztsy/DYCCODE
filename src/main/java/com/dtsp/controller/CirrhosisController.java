package com.dtsp.controller;

import com.dtsp.ModelNew.CirrhosisNew;
import com.dtsp.ModelOld.CirrhosisOld;
import com.dtsp.service.CirrhosisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

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
