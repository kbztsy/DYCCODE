package com.springboot.service;

import com.springboot.ModelNew.HurtNew;
import com.springboot.ModelNew.InfectiousNew;
import com.springboot.ModelOld.HurtOld;
import com.springboot.ModelOld.InfectiousOld;
import com.springboot.ModelRef.InfectiousRef;
import com.springboot.config.DS;
import com.springboot.dao.InfectiousDao;
import com.springboot.dao.InternalDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class InfectiousService {
    @Resource
    private InfectiousDao infectiousDao;
    @Resource
    private InfectiousRef infectiousRef;

    //使用数据源1查询
    @DS("datasource1")
    public List<InfectiousOld> getAllInternal1(){
        return infectiousDao.getInfectious();
    }
    //使用数据源2查询
    @DS("datasource2")
    public List<InfectiousOld> getAllInternal2(){
        return infectiousDao.getInfectious();
    }

    //插入单个数据
    @DS("datasource1")
    public boolean insertInfectious(InfectiousNew infectiousNew){
        try{
            infectiousDao.insertMEDICAL(infectiousNew);
            infectiousDao.insertInfectious(infectiousNew);
        } catch(Exception e){
            throw e;
        }
        return true;
    }

    //将new集合插入到表中
    @DS("datasource1")
    public boolean insertInfectious(List<InfectiousNew> list){
        try{
            for (InfectiousNew infectiousNew:list) {
                insertInfectious(infectiousNew);
            }
        } catch(Exception e){
            return false;
        }
        return true;
    }
    //查询数据转换，并存到数据库
    public List<InfectiousNew> upInfectious(List<InfectiousOld> oldcir){

        try{
            return infectiousRef.REF(oldcir);

        } catch(Exception e){
            return null;
        }
    }
}
