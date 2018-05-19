package com.dtsp.controller;

import com.alibaba.fastjson.JSONObject;
import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.Login;
import com.dtsp.service.HeartBrainService;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/heartbrain")
public class HeartBrainController {
    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(HeartBrainController.class);
    @Resource
    private HeartBrainService heartBrainService;
    @Autowired
    private Login login;

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<HeartBrainOld> heartbrain(){
        List<HeartBrainOld> list = heartBrainService.GetHeartBrain();
        return list;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public JSONObject insert() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("NameMsg","HeartBrain");
        if(login.getJurisdiction() > 6){
            jsonObject.put("StateMsg",2);
            return jsonObject;
        }
        try{
            List<HeartBrainOld> oldcir = heartBrainService.GetHeartBrain();
            List<HeartBrainNew> list= heartBrainService.upHeartBrainls(oldcir);
            if (list.size() == 0) {
                logger.info("HeartBrain查询为空");
                logger.error("HeartBrain查询失败，未插入");
                jsonObject.put("StateMag", 3);
                return jsonObject;
            }
            logger.info("HeartBrain本次获取" + list.size() + "条数据");
            for (HeartBrainNew heartBrainNew:list) {

                heartBrainService.insertHeartBrain(heartBrainNew);
                logger.info("HeartBrain插入成功");
                logger.info("插入数据：" + heartBrainNew);
            }
            jsonObject.put("StateMsg",0);
            return jsonObject;
        } catch(Exception e){
            e.printStackTrace();
            logger.error("HeartBrain异常日志");
            logger.error("失败" + e.getMessage());
            jsonObject.put("StateMsg",1);
            jsonObject.put("Message",e.getMessage());
            return  jsonObject;
        }
    }
}
