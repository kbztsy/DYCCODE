package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.CirrhosisNew;
import com.dtsp.ModelOld.CirrhosisOld;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.CirrhosisService;
import com.dtsp.util.RandNumber;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

//主键
@Controller
@RequestMapping(value = "/cirrhosis")
public class CirrhosisController {
    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(CirrhosisController.class);
    @Autowired
    private CirrhosisService cirrhosisService;
    @Autowired
    private Login login;
    @Autowired
    private RandNumber randNumber;

    @RequestMapping("/all")
    @ResponseBody
    public List<CirrhosisOld> Cirrhosis() {
        List<CirrhosisOld> mapList = cirrhosisService.GetCirrhosis();
        return mapList;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("NameMsg", "Cirrhosis");
        if (login.getJurisdiction() > 6) {
            jsonObject.put("StateMsg", 2);
            return jsonObject;
        }
        try {
            List<CirrhosisOld> lists = cirrhosisService.GetCirrhosis();
            List<CirrhosisNew> newList = cirrhosisService.upCirrhosisls(lists);
            if (newList.size() == 0) {
                logger.info("Cirrhosis查询为空");
                logger.error("Cirrhosis查询失败，未插入");
                jsonObject.put("StateMag", 3);
                return jsonObject;
            }
            logger.info("Cirrhosis本次获取" + newList.size() + "条数据");
            for (int i = 0; i < newList.size(); i++) {
                newList.get(i).setID_No(randNumber.RandInt20());
                newList.get(i).setINF_ID(randNumber.RandStr15());
                cirrhosisService.insertCirrhosis(newList.get(i));
                logger.info("Cirrhosis插入成功");
                logger.info("插入数据：" + newList.get(i));
            }
            jsonObject.put("StateMsg", 0);
            return jsonObject;
        } catch (Exception ex) {
            logger.error("Cirrhosis异常日志");
            logger.error("失败" + ex.getMessage());
            jsonObject.put("StateMsg", 1);
            jsonObject.put("Message", ex.getMessage());
            return jsonObject;
        }
    }
}