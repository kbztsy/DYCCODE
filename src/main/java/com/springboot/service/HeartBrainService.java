package com.springboot.service;

import com.springboot.ModelNew.CirrhosisNew;
import com.springboot.ModelNew.HeartBrainNew;
import com.springboot.ModelOld.CirrhosisOld;
import com.springboot.ModelOld.HeartBrainOld;
import com.springboot.ModelRef.HeartBrainRef;
import com.springboot.config.DS;
import com.springboot.dao.HeartBrainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class HeartBrainService {
    @Autowired
    private HeartBrainDao heartBrainDao;
    @Resource
    private HeartBrainRef heartBrainRef;
    //查询
    @DS("datasource2")
    public List<HeartBrainOld> GetHeartBrain(){
        return heartBrainDao.GetHeartBrain();
    }
    //将CirrhosisNew数据插到新表中
    @DS("datasource1")
    public  boolean insertHeartBrain(HeartBrainNew heartBrainNew) {
        try{
            heartBrainDao.insertMEDICAL(heartBrainNew);
            heartBrainDao.insertHeartBrain(heartBrainNew);
        } catch(Exception e){
            throw e;
        }
        return true;
    }
    //将new集合插入到表中
    @DS("datasource1")
    public boolean insertHeartBrainls(List<HeartBrainNew> list){
        try{
            for (HeartBrainNew heartBrainNew:list) {
                insertHeartBrain(heartBrainNew);
            }
        } catch(Exception e){
            return false;
        }
        return true;
    }
    //查询数据转换，并存到数据库
    public List<HeartBrainNew>  upHeartBrainls( List<HeartBrainOld> oldHeartBrain ){

        try{
            return heartBrainRef.REF(oldHeartBrain);

        } catch(Exception e){
            return null;
        }
    }
}
