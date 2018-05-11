package com.springboot.controller;

import com.springboot.ModelNew.HeartBrainNew;
import com.springboot.ModelOld.HeartBrainOld;
import com.springboot.service.HeartBrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
//@p2
@Controller
@RequestMapping(value = "/heartbrain")
public class HeartBrainController {
    @Resource
    private HeartBrainService heartBrainService;

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<HeartBrainOld> heartbrain(){
        List<HeartBrainOld> list = heartBrainService.GetHeartBrain();
        return list;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert() {

        try{
            List<HeartBrainOld> oldcir = heartBrainService.GetHeartBrain();
            for (HeartBrainOld cirrhosisNew:oldcir
                    ) {
                System.out.println(cirrhosisNew);
            }
            List<HeartBrainNew> list= heartBrainService.upHeartBrainls(oldcir);
            for (HeartBrainNew heartBrainNew:list
                    ) {
                System.out.println(heartBrainNew);
                heartBrainService.insertHeartBrain(heartBrainNew);
            }
            return true;

        } catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }


}
