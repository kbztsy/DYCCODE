package com.dtsp.timer;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelNew.InfectiousNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.InfectiousOld;
import com.dtsp.service.InfectiousService;
import com.dtsp.util.RandNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InfectiousTimer {
    private final Logger logger = LogManager.getLogger(InfectiousTimer.class);
    @Autowired
    private InfectiousService infectiousService;
    @Autowired
    private RandNumber randNumber;
   // @Scheduled(cron = "0 0/10 * * * ?")
  // @Scheduled(fixedRate = 10000)
    public synchronized void InfectiousDemo(){
        try{
            List<InfectiousOld> lists = infectiousService.getAllInternal2();
            List<InfectiousNew> newList = infectiousService.upInfectious(lists);
            if(newList.size() == 0){
                logger.info("Infectious查询为空");
                logger.error("Infectious查询失败，未插入");
                return;
            }
            logger.info("Infectious本次获取"+newList.size()+"条数据");
            for(int i=0;i<newList.size();i++) {
                newList.get(i).setID(randNumber.RandInt20());
                newList.get(i).setINF_ID(randNumber.RandStr15());
                infectiousService.insertInfectious(newList.get(i));
                logger.info("Infectious插入成功");
                logger.info("插入数据："+newList.get(i));
            }
        }catch (Exception ex){
            logger.error("Infectious异常日志");
            logger.error("失败"+ex.getMessage());
        }
    }
}
