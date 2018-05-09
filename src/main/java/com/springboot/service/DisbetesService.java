package com.springboot.service;

import com.springboot.ModelOld.DiabetesOld;
import com.springboot.config.DS;
import com.springboot.dao.DisbetesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisbetesService {
    @Autowired
    private DisbetesDao disbetesDao;
    @DS("datasource2")
    public List<DiabetesOld> GetDisbetes(){
        return disbetesDao.GetDisbetes();
    }
}
