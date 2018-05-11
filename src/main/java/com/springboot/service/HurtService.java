package com.springboot.service;

import com.springboot.ModelNew.CirrhosisNew;
import com.springboot.ModelNew.HurtNew;
import com.springboot.ModelOld.CirrhosisOld;
import com.springboot.ModelOld.HurtOld;
import com.springboot.ModelRef.HurtRef;
import com.springboot.config.DS;
import com.springboot.dao.HurtDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class HurtService {
    @Autowired
    private HurtDao hurtDao;
    @Resource
    private HurtRef hurtRef;
    //查询
    @DS("datasource2")
    public List<HurtOld> GetHurt(){
        return hurtDao.GetHurt();
    }


    //插入单个数据
    @DS("datasource1")
    public boolean insertHurt(HurtNew hurtNew){
        try{
            hurtDao.insertMEDICAL(hurtNew);
            hurtDao.insertHurt(hurtNew);
        } catch(Exception e){
            throw e;
        }
        return true;
    }

    //将new集合插入到表中
    @DS("datasource1")
    public boolean insertHurtls(List<HurtNew> list){
        try{
            for (HurtNew hurtNew:list) {
                insertHurt( hurtNew);
            }
        } catch(Exception e){
            return false;
        }
        return true;
    }
    //查询数据转换，并存到数据库
    public  List<HurtNew> upHurtls(List<HurtOld> oldcir){

        try{
            return  hurtRef.REF(oldcir);
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
