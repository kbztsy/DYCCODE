package com.springboot.service;

import com.springboot.ModelNew.InternalNew;
import com.springboot.ModelNew.MentalNew;
import com.springboot.ModelOld.InternalOld;
import com.springboot.ModelOld.MentalOld;
import com.springboot.ModelRef.MentalRef;
import com.springboot.config.DS;
import com.springboot.dao.MentalDao;
import com.springboot.dao.MoredataDao;
import com.springboot.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * service层
 * Created by pure on 2018-05-06.
 */
@Service
public class MentalService {
    @Resource
    private MentalDao mentalDao;
  @Resource
    private MentalRef mentalRef;
    //使用数据源1查询
   @DS("datasource1")
    public List<MentalOld> getAllMental1(){
        return mentalDao.getMental();
    }
    //使用数据源2查询
    @DS("datasource2")
    public List<MentalOld> getAllMental2(){
        return mentalDao.getMental();
    }

    //插入单个数据
    @DS("datasource1")
    public boolean insertMental(MentalNew mentalNew){
        try{
            mentalDao.insertMEDICAL(mentalNew);
            mentalDao.insertMental(mentalNew);
        } catch(Exception e){
            throw e;
        }
        return true;
    }

    //将new集合插入到表中
    @DS("datasource1")
    public boolean insertMental(List<MentalNew> list){
        try{
            for (MentalNew mentalNew:list) {
                insertMental(mentalNew);
            }
        } catch(Exception e){
            return false;
        }
        return true;
    }
    //查询数据转换，并存到数据库
    public List<MentalNew> upMentalls(List<MentalOld> oldMental){

        try{
            return   mentalRef.REF(oldMental);

        } catch(Exception e){
            return null;
        }
    }




}
