package com.dtsp.service;

import com.dtsp.ModelNew.NauseaNew;
import com.dtsp.ModelOld.NauseaOld;
import com.dtsp.ModelRef.NauseaRef;
import com.dtsp.config.DS;
import com.dtsp.dao.NauseaDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * service层
 * Created by pure on 2018-05-06.
 */
@Service
public class NauseaService {
    @Resource
    private NauseaDao nauseaDao;
 @Resource
    private NauseaRef nauseaRef;
    //使用数据源1查询
   @DS("datasource1")
    public List<NauseaOld> getAllNausea1(){
        return nauseaDao.getNausea();
    }
    //使用数据源2查询
    @DS("datasource2")
    public List<NauseaOld> getAllNausea2(){
        return nauseaDao.getNausea();
    }

    //插入单个数据
    @DS("datasource1")
    public boolean insertNausea(NauseaNew nauseaNew){
        try{
            nauseaDao.insertMEDICAL(nauseaNew);
            nauseaDao.insertNausea(nauseaNew);
        } catch(Exception e){
            throw e;
        }
        return true;
    }

    //将new集合插入到表中
    @DS("datasource1")
    public boolean insertNausea(List<NauseaNew> list){
        try{
            for (NauseaNew nauseaNew:list) {
                insertNausea(nauseaNew);
            }
        } catch(Exception e){
            return false;
        }
        return true;
    }
    //查询数据转换，并存到数据库
    public List<NauseaNew> upNauseals( List<NauseaOld> oldNausea){

        try{
            return nauseaRef.REF(oldNausea);
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }



}
