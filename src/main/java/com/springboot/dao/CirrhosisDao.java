package com.springboot.dao;

import com.springboot.ModelOld.CirrhosisOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface CirrhosisDao {
    public List<CirrhosisOld> GetCirrhosis();
}
