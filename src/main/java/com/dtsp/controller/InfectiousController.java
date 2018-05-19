package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.InfectiousNew;
import com.dtsp.ModelOld.InfectiousOld;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.InfectiousService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/infectious")
public class InfectiousController {
    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(InfectiousController.class);
    @Autowired
    private InfectiousService infectiousService;
    @Autowired
    private Login login;

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
        jsonObject.put("NameMsg","Infectious");
        if(login.getJurisdiction() > 6){
            jsonObject.put("StateMsg",2);
            return jsonObject;
        }
        try{
            List<InfectiousOld> lists = infectiousService.getAllInternal2();

            List<InfectiousNew> list= infectiousService.upInfectious(lists);
            if (list.size() == 0) {
                logger.info("Infectious查询为空");
                logger.error("Infectious查询失败，未插入");
                jsonObject.put("StateMag", 3);
                return jsonObject;
            }
            logger.info("Infectious本次获取" + list.size() + "条数据");
            for (InfectiousNew infectiousNew:list
                    ) {
                infectiousService.insertInfectious(infectiousNew);
                logger.info("Infectious插入成功");
                logger.info("插入数据：" + infectiousNew);
            }
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            logger.error("Infectious异常日志");
            logger.error("失败" + e.getMessage());
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
