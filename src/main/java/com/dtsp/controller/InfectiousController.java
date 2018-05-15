package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.InfectiousNew;
import com.dtsp.ModelOld.InfectiousOld;
import com.dtsp.service.InfectiousService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/infectious")
public class InfectiousController {

    @Resource
    private InfectiousService infectiousService;

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<InfectiousOld> getDb1AllInfectious() {
        List<InfectiousOld> list1 = infectiousService.getAllInternal2();
        System.out.println(list1);
     return list1 ;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        try{
            List<InfectiousOld> oldcir = infectiousService.getAllInternal2();
            for (InfectiousOld infectiousOld:oldcir
                    ) {
                System.out.println(infectiousOld);
            }
            List<InfectiousNew> list= infectiousService.upInfectious(oldcir);
            for (InfectiousNew infectiousNew:list
                    ) {
                System.out.println(infectiousNew);
                infectiousService.insertInfectious(infectiousNew);
            }
            jsonObject.put("NameMsg","Infectious");
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            jsonObject.put("NameMsg","Infectious");
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return jsonObject;
        }
    }

/*
    @RequestMapping(value = "/insertUser")
    public boolean insertUser(@Param("id") String id, @Param("name")String name, @Param("createTime")String createTime){
        boolean flag = false;
        try{
            moredataService.insertUser(id,name,createTime);
            flag = true;
            return flag;
        }catch (Exception ex){
            return  false;
        }
    }*/
}
