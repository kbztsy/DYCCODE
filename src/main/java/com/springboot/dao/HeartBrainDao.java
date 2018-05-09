package com.springboot.dao;

import com.springboot.ModelOld.HeartBrainOld;
import com.springboot.config.DS;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface HeartBrainDao {
    public List<HeartBrainOld> GetHeartBrain();
}
