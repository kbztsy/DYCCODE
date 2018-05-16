package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.CirrhosisNew;
import com.dtsp.ModelOld.CirrhosisOld;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.CirrhosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

//主键
@Controller
@RequestMapping(value = "/cirrhosis")
public class CirrhosisController {
    @Autowired
    private CirrhosisService cirrhosisService;
    @Autowired
    private Login login;
    @RequestMapping("/all")
    @ResponseBody
    public List<CirrhosisOld> Cirrhosis() {
       List<CirrhosisOld> mapList =  cirrhosisService.GetCirrhosis();
       return mapList;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("NameMsg","Cirrhosis");
        if(login.getJurisdiction() > 6){
           jsonObject.put("StateMsg",2);
           return jsonObject;
        }
        try{
            List<CirrhosisOld> oldcir = cirrhosisService.GetCirrhosis();
            for (CirrhosisOld cirrhosisNew:oldcir) {
                System.out.println(cirrhosisNew);
            }
            List<CirrhosisNew> list= cirrhosisService.upCirrhosisls(oldcir);
            for (CirrhosisNew cirrhosisNew:list) {
                System.out.println(cirrhosisNew);
                cirrhosisService.insertCirrhosis(cirrhosisNew);
            }
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return jsonObject;
        }
    }
}
