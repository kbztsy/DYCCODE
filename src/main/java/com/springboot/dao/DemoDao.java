package com.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface DemoDao {
    public List<Map> All1();
    public List<Map> All2();
}
