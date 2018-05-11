package com.springboot.dao;

import com.springboot.ModelNew.CirrhosisNew;
import com.springboot.ModelOld.CirrhosisOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface CirrhosisDao {
    public List<CirrhosisOld> GetCirrhosis();
    //MEDICAL_INFORMATION_ENREGISTER
    public  boolean insertCirrhosis(CirrhosisNew cirrhosisNew);
    public  boolean insertMEDICAL(CirrhosisNew cirrhosisNew);
    public List<Map>  test();
}
