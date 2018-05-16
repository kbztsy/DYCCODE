package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.InternalNew;
import com.dtsp.ModelOld.InternalOld;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.InternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/internal")
public class InternalController {
    @Autowired
    private InternalService internalService;
    @Autowired
    private Login login;

    @RequestMapping("/all")
    @ResponseBody
    public List<InternalOld> getDb1AllInternal() {
        List<InternalOld> list1 = internalService.getAllInternal2();
        System.out.println(list1);
        return list1;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("NameMsg","Internal");
        if(login.getJurisdiction() > 6){
            jsonObject.put("StateMsg",2);
            return jsonObject;
        }
        try{
            List<InternalOld> oldcir = internalService.getAllInternal2();
            for (InternalOld internalOld:oldcir
                    ) {
                System.out.println(internalOld);
            }
            List<InternalNew> list= internalService.upInternalls(oldcir);
            for (InternalNew internalNew :list
                    ) {
                System.out.println(internalNew);
                internalService.insertInternal(internalNew);
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