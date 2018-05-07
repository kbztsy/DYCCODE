package com.springboot.dao;

import com.springboot.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * dao层
 * Created by pure on 2018-05-06.
 */
@Mapper
@Component
public interface MoredataDao {
    //使用xml配置形式查询
    public List<Map> getAllUser();
    public Long addUserGetID(Demo user);
    public void addUser(@Param("name") String name);
}
