package com.springboot.dao;

import com.springboot.ModelNew.InternalNew;
import com.springboot.ModelOld.InternalOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface InternalDao {

    //查询所有Internal
    public List<InternalOld> getInternal();
    //插入
    public boolean insertInternal(InternalNew internalNew);
    public  boolean insertMEDICAL (InternalNew internalNew);
}
