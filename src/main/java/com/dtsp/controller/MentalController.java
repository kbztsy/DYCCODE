package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.MentalNew;
import com.dtsp.ModelOld.Login;
import com.dtsp.ModelOld.MentalOld;
import com.dtsp.service.MentalService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/mental")
public class MentalController {
    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(MentalController.class);
    @Autowired
    private MentalService mentalService;
    @Autowired
    private Login login;

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
        jsonObject.put("NameMsg","Mental");
        if(login.getJurisdiction() > 6){
            jsonObject.put("StateMsg",2);
            return jsonObject;
        }
        try{
            List<MentalOld> oldcir = mentalService.getAllMental2();

            List<MentalNew> list= mentalService.upMentalls(oldcir);
            if (list.size() == 0) {
                logger.info("Mental查询为空");
                logger.error("Mental查询失败，未插入");
                jsonObject.put("StateMag", 3);
                return jsonObject;
            }
            logger.info("Mental本次获取" + list.size() + "条数据");
            for (MentalNew mentalNew:list) {
                mentalService.insertMental(mentalNew);
                logger.info("Mental插入成功");
                logger.info("插入数据：" + mentalNew);
            }

            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            logger.error("Mental异常日志");
            logger.error("失败" + e.getMessage());
            jsonObject.put("NameMsg","Mental");
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return jsonObject;
        }
    }
}