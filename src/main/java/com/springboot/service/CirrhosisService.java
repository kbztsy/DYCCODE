package com.springboot.service;

import com.springboot.ModelOld.CirrhosisOld;
import com.springboot.config.DS;
import com.springboot.dao.CirrhosisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CirrhosisService {
    @Autowired
    private CirrhosisDao cirrhosisDao;
    @DS("datasource2")
    public List<CirrhosisOld> GetCirrhosis(){
        return cirrhosisDao.GetCirrhosis();
    }
}
