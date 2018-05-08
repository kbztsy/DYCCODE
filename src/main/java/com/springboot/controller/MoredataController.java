package com.springboot.controller;

import com.springboot.service.MoredataService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by pure on 2018-05-06.
 */
//@CrossOrigin
@RestController
@RequestMapping("/moredata")
public class MoredataController {
    @Autowired
    private MoredataService moredataService;

    @RequestMapping(value = "/getDb1AllUser")
    public List<Map> getDb1AllUser() {
        List<Map> list1 = moredataService.getAllUser1();
        System.out.println(list1);
//        List<Map> list2 = moredataService.getAllUser2();
//        System.out.println(list2);
        List<Map> list = new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            list.add(list1.get(i));
        }
//        for (int i=0;i<list2.size();i++){
//            list.add(list2.get(i));
//        }
        System.out.println(list);
        return list;
    }

    @RequestMapping(value = "/insertUser")
    public boolean insertUser(@Param("id") String id,@Param("name")String name,@Param("createTime")String createTime){
        boolean flag = false;
        try{
            moredataService.insertUser(id,name,createTime);
            flag = true;
            return flag;
        }catch (Exception ex){
            return  false;
        }
    }
}
