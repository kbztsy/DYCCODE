package com.dtsp.controller;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import com.dtsp.ModelRef.DiabetesRef;
import com.dtsp.service.DisbetesService;
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
    @Autowired
    private DiabetesRef diabetesRef;

    @RequestMapping(value = "/all")
    @ResponseBody
    public boolean GetDisbetes(){
        List<DiabetesOld> mapList = disbetesService.GetDisbetes();
        System.out.println(mapList);
        List<DiabetesNew> diabetesNew = diabetesRef.REF(mapList);
        boolean diabetes =false;
//        for(int i=0;i<= diabetesNew.size();i++) {
//            System.out.println(diabetesNew.get(i).getINF_ID());
//            diabetes = disbetesService.InsertDisBetea(diabetesNew.get(i));
//
//        }
        return diabetes;
    }


}
