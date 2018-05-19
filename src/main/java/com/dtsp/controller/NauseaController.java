package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.NauseaNew;
import com.dtsp.ModelOld.Login;
import com.dtsp.ModelOld.NauseaOld;
import com.dtsp.service.NauseaService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/nausea")
public class NauseaController {
    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(NauseaController.class);
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

            List<NauseaNew> list= nauseaService.upNauseals(oldcir);
            if (list.size() == 0) {
                logger.info("Nausea查询为空");
                logger.error("Nausea查询失败，未插入");
                jsonObject.put("StateMag", 3);
                return jsonObject;
            }
            logger.info("Nausea本次获取" + list.size() + "条数据");
            for (NauseaNew nuseaNew:list) {
                nauseaService.insertNausea(nuseaNew);
                logger.info("Nausea插入成功");
                logger.info("插入数据：" + nuseaNew);
            }
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            logger.error("Nausea异常日志");
            logger.error("失败" + e.getMessage());
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return jsonObject;
        }
    }
}