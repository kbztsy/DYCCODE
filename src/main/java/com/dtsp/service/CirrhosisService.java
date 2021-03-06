package com.dtsp.service;

import com.dtsp.ModelNew.CirrhosisNew;
import com.dtsp.ModelOld.CirrhosisOld;
import com.dtsp.ModelRef.CirrhosisRef;
import com.dtsp.config.DS;
import com.dtsp.dao.CirrhosisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class CirrhosisService {
    @Autowired
    private CirrhosisDao cirrhosisDao;
    @Resource
    private CirrhosisRef cirrhosisRef;
    @DS("datasource2")
    public List<CirrhosisOld> GetCirrhosis(){
        return cirrhosisDao.GetCirrhosis();
    }
    //将CirrhosisNew数据插到新表中
    @DS("datasource1")
    public  boolean insertCirrhosis(CirrhosisNew cirrhosisNew) {
        try {
            cirrhosisDao.insertMEDICAL(cirrhosisNew);
            cirrhosisDao.insertCirrhosis(cirrhosisNew);
            return true;
        } catch (Exception e) {
            return  false;
        }
    }
    //查询数据转换，并存到数据库
    public List<CirrhosisNew> upCirrhosisls(List<CirrhosisOld> oldcir){

        try{
            List<CirrhosisNew> list= cirrhosisRef.REF(oldcir);
           return list;
        } catch(Exception e){
            return null;
        }
    }
}
