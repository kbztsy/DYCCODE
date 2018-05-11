package com.springboot.controller;

import com.springboot.ModelNew.HurtNew;
import com.springboot.ModelOld.HurtOld;
import com.springboot.service.HurtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/hurt")
public class HurtController {
    @Resource
    private HurtService hurtService;
    @RequestMapping(value = "/all")
    @ResponseBody
    public List<HurtOld> hurt(){
        List<HurtOld> list = hurtService.GetHurt();
        return list;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert() {
        try{
            List<HurtOld> oldcir = hurtService.GetHurt();
            for (HurtOld hurtOld:oldcir
                    ) {
                System.out.println(hurtOld);
            }
            List<HurtNew> list= hurtService.upHurtls(oldcir);
            for (HurtNew hurtNew:list
                    ) {
                System.out.println(hurtNew);
                hurtService.insertHurt(hurtNew);
            }
            return true;

        } catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }

}
