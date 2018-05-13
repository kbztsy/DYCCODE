package com.dtsp.dao;

import com.dtsp.ModelNew.MentalNew;
import com.dtsp.ModelOld.MentalOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MentalDao {
    //查询所有Mental
    public List<MentalOld> getMental();
    //插入
    public boolean insertMental(MentalNew mentalNew);
    public  boolean insertMEDICAL(MentalNew mentalNew);
}
