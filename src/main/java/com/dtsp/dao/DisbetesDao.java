package com.dtsp.dao;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DisbetesDao {
    public List<DiabetesOld> GetDisbetes();
    public  boolean insertDisbetes(DiabetesNew diabetesNew);
    public  boolean insertMEDICAL(DiabetesNew diabetesNew);
}
