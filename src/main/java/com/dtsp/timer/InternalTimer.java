package com.dtsp.timer;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelNew.InternalNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.InternalOld;
import com.dtsp.service.InternalService;
import com.dtsp.util.RandNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InternalTimer {
    private final Logger logger = LogManager.getLogger(InternalTimer.class);
    @Autowired
    private InternalService internalService;
    @Autowired
    private RandNumber randNumber;
   // @Scheduled(cron = "0 0/10 * * * ?")
  // @Scheduled(fixedRate = 10000)
    public synchronized void InternalDemo(){
        try{
            List<InternalOld> lists = internalService.getAllInternal2();
            List<InternalNew> newList = internalService.upInternalls(lists);
            if(newList.size() == 0){
                logger.info("Internal查询为空");
                logger.error("Internal查询失败，未插入");
                return;
            }
            logger.info("Internal本次获取"+newList.size()+"条数据");
            for(int i=0;i<newList.size();i++) {
                newList.get(i).setID(randNumber.RandInt20());
                newList.get(i).setINF_ID(randNumber.RandStr15());
                internalService.insertInternal(newList.get(i));
                logger.info("Internal插入成功");
                logger.info("插入数据："+newList.get(i));
            }
        }catch (Exception ex){
            logger.error("Internal异常日志");
            logger.error("失败"+ex.getMessage());
        }
    }
}
