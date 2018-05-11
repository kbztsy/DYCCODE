package com.dtsp.controller;

import com.dtsp.ModelNew.MentalNew;
import com.dtsp.ModelOld.MentalOld;
import com.dtsp.service.MentalService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/mental")
public class MentalController {
    @Resource
    private MentalService mentalService;

    @RequestMapping("/getDb1AllMental")
    @ResponseBody
    public List<MentalOld> getDb1Mental() {
        List<MentalOld> list1 = mentalService.getAllMental2();
        System.out.println(list1);
        return list1;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public boolean insert() {
        try{
            List<MentalOld> oldcir = mentalService.getAllMental2();
            for (MentalOld mentalOld:oldcir
                    ) {
                System.out.println(mentalOld);
            }
            List<MentalNew> list= mentalService.upMentalls(oldcir);
            for (MentalNew mentalNew:list
                    ) {
                System.out.println(mentalNew);
                mentalService.insertMental(mentalNew);
            }
            return true;

        } catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
}