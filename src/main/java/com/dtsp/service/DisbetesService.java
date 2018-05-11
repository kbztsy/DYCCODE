package com.dtsp.service;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import com.dtsp.config.DS;
import com.dtsp.dao.DisbetesDao;
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

    @DS("datasource1")
    public boolean InsertDisBetea(DiabetesNew diabetesNew){
        return  disbetesDao.InsertDisBetea(diabetesNew);
    }
}