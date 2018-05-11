package com.dtsp.dao;

import com.dtsp.ModelNew.InfectiousNew;
import com.dtsp.ModelOld.InfectiousOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface InfectiousDao {

    //查询所有Infectious
    public List<InfectiousOld> getInfectious();
    //插入
    public boolean insertInfectious(InfectiousNew infectiousNew);
    public  boolean insertMEDICAL(InfectiousNew infectiousNew);

}
