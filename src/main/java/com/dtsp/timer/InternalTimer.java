package com.dtsp.timer;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelNew.InternalNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.InternalOld;
import com.dtsp.service.InternalService;
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
    @Scheduled(cron = "0 0/10 * * * ?")
    public void InterTimer(){
        try {
            List<InternalOld> lists = internalService.getAllInternal2();
            List<InternalNew> newList = internalService.upInternalls(lists);
            if(newList.size() == 0){
                logger.info("查询完毕。");
                return;
            }
            for(int i=0;i<newList.size();i++) {
                internalService.insertInternal(newList.get(i));
            }
            logger.info("插入成功");
        }catch (Exception ex){
            logger.error("失败"+ex.getMessage());
        }
    }
}
