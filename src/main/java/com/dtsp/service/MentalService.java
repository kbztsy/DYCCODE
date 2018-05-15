package com.dtsp.service;

import com.dtsp.ModelNew.MentalNew;
import com.dtsp.ModelOld.MentalOld;
import com.dtsp.ModelRef.MentalRef;
import com.dtsp.config.DS;
import com.dtsp.dao.MentalDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
