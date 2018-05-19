package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.InternalNew;
import com.dtsp.ModelOld.InternalOld;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.InternalService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/internal")
public class InternalController {
    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(InternalController.class);
    @Autowired
    private InternalService internalService;
    @Autowired
    private Login login;

    @RequestMapping("/all")
    @ResponseBody
    public List<InternalOld> getDb1AllInternal() {
        List<InternalOld> list1 = internalService.getAllInternal2();
        System.out.println(list1);
        return list1;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("NameMsg","Internal");
        if(login.getJurisdiction() > 6){
            jsonObject.put("StateMsg",2);
            return jsonObject;
        }
        try{
            List<InternalOld> oldcir = internalService.getAllInternal2();

            List<InternalNew> list= internalService.upInternalls(oldcir);
            if (list.size() == 0) {
                logger.info("Internal查询为空");
                logger.error("Internal查询失败，未插入");
                jsonObject.put("StateMag", 3);
                return jsonObject;
            }
            logger.info("Internal本次获取" + list.size() + "条数据");
            for (InternalNew internalNew :list
                    ) {
                internalService.insertInternal(internalNew);
                logger.info("Internal插入成功");
                logger.info("插入数据：" + internalNew);
            }
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            logger.error("Internal异常日志");
            logger.error("失败" + e.getMessage());
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return jsonObject;
        }
    }
}