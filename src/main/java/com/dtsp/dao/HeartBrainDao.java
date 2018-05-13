package com.dtsp.dao;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelOld.HeartBrainOld;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HeartBrainDao {
    public List<HeartBrainOld> GetHeartBrain();
    public  boolean insertHeartBrain(HeartBrainNew heartBrain);
    public  boolean insertMEDICAL(HeartBrainNew heartBrain);
}
