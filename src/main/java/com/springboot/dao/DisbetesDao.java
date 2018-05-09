package com.springboot.dao;

import com.springboot.ModelOld.DiabetesOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DisbetesDao {
    public List<DiabetesOld> GetDisbetes();
}
