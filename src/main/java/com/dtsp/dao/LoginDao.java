package com.dtsp.dao;

import com.dtsp.ModelOld.Login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface LoginDao {
    public List<Login> SelctLogin(Login login);
 }
