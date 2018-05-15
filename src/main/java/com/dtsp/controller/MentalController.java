package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.MentalNew;
import com.dtsp.ModelOld.MentalOld;
import com.dtsp.service.MentalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/mental")
public class MentalController {
    @Resource
    private MentalService mentalService;

    @RequestMapping("/all")
    @ResponseBody
    public List<MentalOld> getDb1Mental() {
        List<MentalOld> list1 = mentalService.getAllMental2();
        System.out.println(list1);
        return list1;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        try{
            List<MentalOld> oldcir = mentalService.getAllMental2();
            for (MentalOld mentalOld:oldcir) {
                System.out.println(mentalOld);
            }
            List<MentalNew> list= mentalService.upMentalls(oldcir);
            for (MentalNew mentalNew:list) {
                System.out.println(mentalNew);
                mentalService.insertMental(mentalNew);
            }
            jsonObject.put("NameMsg","Mental");
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            jsonObject.put("NameMsg","Mental");
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return jsonObject;
        }
    }
}