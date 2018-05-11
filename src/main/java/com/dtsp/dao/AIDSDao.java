package com.dtsp.dao;

import com.dtsp.ModelOld.HurtOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface AIDSDao {
    public List<HurtOld> GetAIDS();
    public boolean InsertAIDS(Map map);
}
