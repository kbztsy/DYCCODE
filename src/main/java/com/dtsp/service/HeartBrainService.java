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
    @DS("datasource1")
    public  boolean insertHeartBrain(HeartBrainNew heartBrainNew) {
        try{
            switch (heartBrainNew.getBKLX_ID()){
                case "31"://冠心病 31
                    heartBrainDao.insertHEART(heartBrainNew);
                    heartBrainDao.insertHeartBrain(heartBrainNew);
                    return true;
                case "32"://脑卒中 32
                    heartBrainDao.insertBRAIN(heartBrainNew);
                    heartBrainDao.insertHeartBrain(heartBrainNew);
                    return true;
                case "33"://高血压33
                    heartBrainDao.insertHEIGHT(heartBrainNew);
                    heartBrainDao.insertHeartBrain(heartBrainNew);
                    return true;
            }
            return true;
        } catch(Exception e){
         e.printStackTrace();
         return  false;
        }

    }
    @DS("datasource1")
    public boolean insertHeartBrainls(List<HeartBrainNew> list){
        try{
            for (HeartBrainNew heartBrainNew:list) {
                insertHeartBrain(heartBrainNew);
            }
        } catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public List<HeartBrainNew>  upHeartBrainls( List<HeartBrainOld> oldHeartBrain ){
        try{
            return heartBrainRef.REF(oldHeartBrain);

        } catch(Exception e){
            return null;
        }
    }
}
