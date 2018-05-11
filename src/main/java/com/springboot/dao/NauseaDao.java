package com.springboot.dao;

import com.springboot.ModelNew.NauseaNew;
import com.springboot.ModelOld.NauseaOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface NauseaDao {
    //查询所有Mental
    public List<NauseaOld> getNausea();
    //插入
    public boolean insertNausea(NauseaNew nauseaNew);
    public  boolean insertMEDICAL (NauseaNew nauseaNew);
}
