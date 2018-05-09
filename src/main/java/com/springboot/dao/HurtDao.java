package com.springboot.dao;

import com.springboot.ModelOld.HurtOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HurtDao {
    public List<HurtOld> GetHurt();
}
