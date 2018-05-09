package com.springboot.service;

import com.springboot.ModelOld.HeartBrainOld;
import com.springboot.config.DS;
import com.springboot.dao.HeartBrainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HeartBrainService {
    @Autowired
    private HeartBrainDao heartBrainDao;
    @DS("datasource2")
    public List<HeartBrainOld> GetHeartBrain(){
        return heartBrainDao.GetHeartBrain();
    }
}
