package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.NauseaNew;
import com.dtsp.ModelOld.Login;
import com.dtsp.ModelOld.NauseaOld;
import com.dtsp.service.NauseaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/nausea")
public class NauseaController {
    @Autowired
    private NauseaService nauseaService;
    @Autowired
    private Login login;
    @RequestMapping("/all")
    @ResponseBody
    public List<NauseaOld> getDb1AllNausea() {
        List<NauseaOld> list1 = nauseaService.getAllNausea2();
        System.out.println(list1);
        return list1;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("NameMsg","Nausea");
        if(login.getJurisdiction() > 6){
            jsonObject.put("StateMsg",2);
            return jsonObject;
        }
        try{
            List<NauseaOld> oldcir = nauseaService.getAllNausea2();
            for (NauseaOld nauseaOld:oldcir) {
                System.out.println(nauseaOld);
            }
            List<NauseaNew> list= nauseaService.upNauseals(oldcir);
            for (NauseaNew nuseaNew:list) {
                System.out.println(nuseaNew);
                nauseaService.insertNausea(nuseaNew);
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