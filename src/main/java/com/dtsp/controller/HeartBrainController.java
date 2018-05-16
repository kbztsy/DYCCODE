package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.HeartBrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/heartbrain")
public class HeartBrainController {
    @Resource
    private HeartBrainService heartBrainService;
    @Autowired
    private Login login;

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<HeartBrainOld> heartbrain(){
        List<HeartBrainOld> list = heartBrainService.GetHeartBrain();
        return list;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("NameMsg","HeartBrain");
        if(login.getJurisdiction() > 6){
            jsonObject.put("StateMsg",2);
            return jsonObject;
        }
        try{
            List<HeartBrainOld> oldcir = heartBrainService.GetHeartBrain();
            for (HeartBrainOld cirrhosisNew:oldcir) {
                System.out.println(cirrhosisNew);
            }
            List<HeartBrainNew> list= heartBrainService.upHeartBrainls(oldcir);
            for (HeartBrainNew heartBrainNew:list) {
                System.out.println(heartBrainNew);
                heartBrainService.insertHeartBrain(heartBrainNew);
            }
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return  jsonObject;
        }
    }
}
