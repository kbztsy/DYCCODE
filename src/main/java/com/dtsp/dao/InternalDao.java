package com.dtsp.dao;

import com.dtsp.ModelNew.InternalNew;
import com.dtsp.ModelOld.InternalOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface InternalDao {

    //查询所有Internal
    public List<InternalOld> getInternal();
    //插入
    public boolean insertInternal(InternalNew internalNew);
    public  boolean insertMEDICAL(InternalNew internalNew);
}
