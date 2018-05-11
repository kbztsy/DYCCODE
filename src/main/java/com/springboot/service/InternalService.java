package com.springboot.service;

import com.springboot.ModelNew.InfectiousNew;
import com.springboot.ModelNew.InternalNew;
import com.springboot.ModelOld.InfectiousOld;
import com.springboot.ModelOld.InternalOld;
import com.springboot.ModelRef.InternalRef;
import com.springboot.config.DS;
import com.springboot.dao.InternalDao;
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
public class InternalService {
    @Resource
    private InternalDao internalDao;
    @Resource
    private InternalRef internalRef;

    //使用数据源1查询
   @DS("datasource1")
    public List<InternalOld> getAllInternal1(){
        return internalDao.getInternal();
    }
    //使用数据源2查询
    @DS("datasource2")
    public List<InternalOld> getAllInternal2(){
        return internalDao.getInternal();
    }

    //插入单个数据
    @DS("datasource1")
    public boolean insertInternal(InternalNew internalNew){
        try{
            internalDao.insertMEDICAL(internalNew);
            internalDao.insertInternal(internalNew);
        } catch(Exception e){
            throw e;
        }
        return true;
    }

    //将new集合插入到表中
    @DS("datasource1")
    public boolean insertInternal(List<InternalNew> list){
        try{
            for (InternalNew internalNew:list) {
                insertInternal(internalNew);
            }
        } catch(Exception e){
            return false;
        }
        return true;
    }
    //查询数据转换，并存到数据库
    public List<InternalNew> upInternalls(List<InternalOld> oldInternal){

        try{
            return internalRef.REF(oldInternal);

        } catch(Exception e){
            return null;
        }
    }

}
