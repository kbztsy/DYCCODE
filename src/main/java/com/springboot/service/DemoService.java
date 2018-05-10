package com.springboot.service;

import com.springboot.ModelOld.CirrhosisOld;
import com.springboot.config.DS;
import com.springboot.dao.CirrhosisDao;
import com.springboot.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DemoService {
    @Autowired
    private DemoDao demoDao;
    @DS("datasource1")
    public List<Map> All1(){
        return demoDao.All1();
    }
    @DS("datasource2")
    public List<Map> All2(){
        return demoDao.All2();
    }
}