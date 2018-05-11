package com.dtsp.controller;


import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import com.dtsp.service.DisbetesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
//正常
@Controller
@RequestMapping(value = "/disbetes")
public class DisbetesController {
    @Resource
    private DisbetesService disbetesService;

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<DiabetesOld> GetDisbetes(){
        List<DiabetesOld> mapList = disbetesService.GetDisbetes();
        return mapList;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert() {
        try{
            List<DiabetesOld> oldcir = disbetesService.GetDisbetes();
            for (DiabetesOld diabetesOld:oldcir
                    ) {
                System.out.println(diabetesOld);
            }
            List<DiabetesNew> list= disbetesService.upCirrhosisls(oldcir);
            for (DiabetesNew diabetesNew:list) {
                System.out.println(diabetesNew);
                disbetesService.insertDisbetes(diabetesNew);
            }

        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
                return true;
    }

}
