package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.HurtNew;
import com.dtsp.ModelOld.HurtOld;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.HurtService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping(value = "/hurt")
public class HurtController {
    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(HurtController.class);
    @Autowired
    private HurtService hurtService;
    @Autowired
    private Login login;

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
        jsonObject.put("NameMsg","Hurt");
        if(login.getJurisdiction() > 6){
            jsonObject.put("StateMsg",2);
            return jsonObject;
        }
        try{
            List<HurtOld> oldcir = hurtService.GetHurt();

            List<HurtNew> list= hurtService.upHurtls(oldcir);
            if (list.size() == 0) {
                logger.info("HeartBrain查询为空");
                logger.error("HeartBrain查询失败，未插入");
                jsonObject.put("StateMag", 3);
                return jsonObject;
            }
            logger.info("Hurt本次获取" +list.size() + "条数据");
            for (HurtNew hurtNew:list) {

                hurtService.insertHurt(hurtNew);
                logger.info("Hurt插入成功");
                logger.info("插入数据：" + hurtNew);
            }
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            logger.error("Hurt异常日志");
            logger.error("失败" + e.getMessage());
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return jsonObject;
        }
    }
}
