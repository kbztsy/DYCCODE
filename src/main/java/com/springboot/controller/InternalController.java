package com.springboot.controller;

import com.springboot.ModelNew.InternalNew;
import com.springboot.ModelOld.InternalOld;
import com.springboot.service.InternalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/internal")
public class InternalController {
    @Resource
    private InternalService internalService;

    @RequestMapping("/getDb1AllInternal")
    @ResponseBody
    public List<InternalOld> getDb1AllInternal() {
        List<InternalOld> list1 = internalService.getAllInternal2();
        System.out.println(list1);
        return list1;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert() {
        try{
            List<InternalOld> oldcir = internalService.getAllInternal2();
            for (InternalOld internalOld:oldcir
                    ) {
                System.out.println(internalOld);
            }
            List<InternalNew> list= internalService.upInternalls(oldcir);
            for (InternalNew internalNew :list
                    ) {
                System.out.println(internalNew);
                internalService.insertInternal(internalNew);
            }
            return true;

        } catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
}