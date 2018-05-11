package com.dtsp.dao;

import com.dtsp.ModelNew.HurtNew;
import com.dtsp.ModelOld.HurtOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HurtDao {
    public List<HurtOld> GetHurt();
    public  boolean insertHurt(HurtNew hurtNew);
    public  boolean insertMEDICAL(HurtNew hurtNew);
}
