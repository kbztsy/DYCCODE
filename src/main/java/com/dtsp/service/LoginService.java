package com.dtsp.service;

import com.dtsp.ModelOld.Login;
import com.dtsp.config.DS;
import com.dtsp.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;
    @DS("datasource1")
    public List<Login> SelectLogin(Login login){
        return loginDao.SelctLogin(login);
    }
}
