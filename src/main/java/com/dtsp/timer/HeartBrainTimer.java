package com.dtsp.timer;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelOld.DiabetesOld;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.service.HeartBrainService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HeartBrainTimer {
    private final Logger logger = LogManager.getLogger(HeartBrainTimer.class);
    @Autowired
    private HeartBrainService heartBrainService;
    @Scheduled(cron = "0 0/10 * * * ?")
    public void hhTimer(){
        try {
            List<HeartBrainOld> lists = heartBrainService.GetHeartBrain();
            List<HeartBrainNew> newList = heartBrainService.upHeartBrainls(lists);
            if(newList.size() == 0){
                logger.info("查询完毕。");
                return;
            }
            for(int i=0;i<newList.size();i++) {
                heartBrainService.insertHeartBrain(newList.get(i));
            }
            logger.info("插入成功");
        }catch (Exception ex) {
            logger.error("失败" + ex.getMessage());
        }
    }
}
