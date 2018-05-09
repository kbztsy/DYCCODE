package com.springboot.service;

import com.springboot.ModelOld.HurtOld;
import com.springboot.config.DS;
import com.springboot.dao.HurtDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HurtService {
    @Autowired
    private HurtDao hurtDao;
    @DS("datasource2")
    public List<HurtOld> GetHurt(){
        return hurtDao.GetHurt();
    }
}
