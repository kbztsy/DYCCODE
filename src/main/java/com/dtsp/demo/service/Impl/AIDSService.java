package com.dtsp.demo.service.Impl;

import com.dtsp.demo.ModelOld.AIDSOld;
import com.dtsp.demo.mapper.IAIDSMapper;
import com.dtsp.demo.service.IAIDSService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIDSService implements IAIDSService {
    private Logger logger = LoggerFactory.getLogger(AIDSService.class);
    @Autowired
    private IAIDSMapper aidsMapper;
    @Override
    public List<AIDSOld> findAIDS(){
        try{
            List<AIDSOld> list = aidsMapper.findAIDS();
            return list;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
