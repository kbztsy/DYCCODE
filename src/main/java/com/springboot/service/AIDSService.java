package com.springboot.service;

import com.springboot.ModelOld.HurtOld;
import com.springboot.config.DS;
import com.springboot.dao.AIDSDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AIDSService {//艾滋病
    @Autowired
    private AIDSDao aidsDao;
    @DS("datasource2")
    public List<HurtOld> GetAIDS(){
        return aidsDao.GetAIDS();
    };

    @DS("datasource1")
    public boolean InsertAIDS(Map map){
        return aidsDao.InsertAIDS(map);
    };
}
