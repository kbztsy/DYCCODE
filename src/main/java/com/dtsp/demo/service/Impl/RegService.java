package com.dtsp.demo.service.Impl;

import com.dtsp.demo.mapper.IUserMapper;
import com.dtsp.demo.service.IRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018-04-27.
 */
@Service()
public class RegService implements IRegService {
    @Autowired
    private IUserMapper userMapper;
    @Override
    public boolean regUser(String t1, String t2) {
        Boolean flag;
        try {
            flag = userMapper.insertUsers(t1,t2);
            System.out.println("这执行了么");
        }catch (Exception e){
            return false;
        }
        return flag;
    }
}
