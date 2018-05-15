package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.HurtNew;
import com.dtsp.ModelOld.HurtOld;
import com.dtsp.service.HurtService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/hurt")
public class HurtController {
    @Resource
    private HurtService hurtService;
    @RequestMapping(value = "/all")
    @ResponseBody
    public List<HurtOld> hurt(){
        List<HurtOld> list = hurtService.GetHurt();
        return list;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        try{
            List<HurtOld> oldcir = hurtService.GetHurt();
            for (HurtOld hurtOld:oldcir) {
                System.out.println(hurtOld);
            }
            List<HurtNew> list= hurtService.upHurtls(oldcir);
            for (HurtNew hurtNew:list) {
                System.out.println(hurtNew);
                hurtService.insertHurt(hurtNew);
            }
            jsonObject.put("NameMsg","Hurt");
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            jsonObject.put("NameMsg","Hurt");
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return jsonObject;
        }
    }
}
