package com.dtsp.service;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import com.dtsp.ModelRef.DiabetesRef;
import com.dtsp.config.DS;
import com.dtsp.dao.DisbetesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DisbetesService {
    @Autowired
    private DisbetesDao disbetesDao;
    @Resource
    private DiabetesRef diabetesRef;
    //查询
    @DS("datasource2")
    public List<DiabetesOld> GetDisbetes(){
        return disbetesDao.GetDisbetes();
    }
    //单个插入
    @DS("datasource1")
    public  boolean insertDisbetes( DiabetesNew diabetesNew){
        try{
            disbetesDao.insertMEDICAL(diabetesNew);
            disbetesDao.insertDisbetes(diabetesNew);
            return true;
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
    //list插入
    //将new集合插入到表中
    public boolean insertDisbetesls(List<DiabetesNew> list){
        try{
            for (DiabetesNew diabetesNew:list) {
                insertDisbetes( diabetesNew);
            }
        } catch(Exception e){
            return false;
        }
        return true;
    }
    //查询数据转换，并存到数据库
    public List<DiabetesNew>  upCirrhosisls( List<DiabetesOld>diabetes){

        try{
            return  diabetesRef.REF(diabetes);

        } catch(Exception e){
            return null;
        }
    }
}
