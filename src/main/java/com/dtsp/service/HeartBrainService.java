package com.dtsp.service;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelRef.HeartBrainRef;
import com.dtsp.config.DS;
import com.dtsp.dao.HeartBrainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
            heartBrainDao.insertMEDICAL2(heartBrainNew);
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
