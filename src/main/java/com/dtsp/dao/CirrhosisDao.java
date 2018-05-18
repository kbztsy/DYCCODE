package com.dtsp.dao;

import com.dtsp.ModelNew.CirrhosisNew;
import com.dtsp.ModelOld.CirrhosisOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface CirrhosisDao {
    public List<CirrhosisOld> GetCirrhosis();
    public  boolean insertCirrhosis(CirrhosisNew cirrhosisNew);
    public  boolean insertMEDICAL(CirrhosisNew cirrhosisNew);
}
