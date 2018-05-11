package com.springboot.controller;

import com.springboot.ModelNew.NauseaNew;
import com.springboot.ModelOld.NauseaOld;
import com.springboot.service.InternalService;
import com.springboot.service.NauseaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/nausea")
public class NauseaController {
    @Resource
    private NauseaService nauseaService;
    @RequestMapping("/getDb1AllNausea")
    @ResponseBody
    public List<NauseaOld> getDb1AllNausea() {
        List<NauseaOld> list1 = nauseaService.getAllNausea2();
        System.out.println(list1);
        return list1;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert() {
        try{
            List<NauseaOld> oldcir = nauseaService.getAllNausea2();
            for (NauseaOld nauseaOld:oldcir
                    ) {
                System.out.println(nauseaOld);
            }
            List<NauseaNew> list= nauseaService.upNauseals(oldcir);
            for (NauseaNew nuseaNew:list
                    ) {
                System.out.println(nuseaNew);
                nauseaService.insertNausea(nuseaNew);
            }
            return true;

        } catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
}