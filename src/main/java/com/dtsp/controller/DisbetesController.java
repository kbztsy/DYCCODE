package com.dtsp.controller;


import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.DisbetesService;
import com.dtsp.util.RandNumber;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
//正常
@Controller
@RequestMapping(value = "/disbetes")
public class DisbetesController {
    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(DisbetesController.class);
    @Resource
    private DisbetesService disbetesService;
    @Autowired
    private Login login;
    @Autowired
    private RandNumber randNumber;
    @RequestMapping(value = "/all")
    @ResponseBody
    public List<DiabetesOld> GetDisbetes(){
        List<DiabetesOld> mapList = disbetesService.GetDisbetes();
        return mapList;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("NameMsg","Disbetes");
        if(login.getJurisdiction() > 6){
            jsonObject.put("StateMsg",2);
            return jsonObject;
        }
        try{
            List<DiabetesOld> oldcir = disbetesService.GetDisbetes();
            for (DiabetesOld diabetesOld:oldcir){
                System.out.println(diabetesOld);
            }
            List<DiabetesNew> list= disbetesService.upCirrhosisls(oldcir);
            if (list.size() == 0) {
                logger.info("Diabetes查询为空");
                logger.error("Diabetes查询失败，未插入");
                jsonObject.put("StateMag", 3);
                return jsonObject;
            }
            logger.info("Diabetes本次获取" + list.size() + "条数据");
            for (DiabetesNew diabetesNew:list) {
                diabetesNew.setID(randNumber.RandInt20());
                diabetesNew.setINF_ID(randNumber.RandStr15());
                disbetesService.insertDisbetes(diabetesNew);
                logger.info("Diabetes插入成功");
                logger.info("插入数据：" + diabetesNew);
            }
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e) {
            e.printStackTrace();
            logger.error("Diabetes异常日志");
            logger.error("失败" + e.getMessage());
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return jsonObject;
        }
    }
}
