package com.dtsp.timer;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelNew.HurtNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.HurtOld;
import com.dtsp.service.HurtService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HurtTimer {
    private final Logger logger = LogManager.getLogger(HurtTimer.class);
    @Autowired
    private HurtService hurtService;
    @Scheduled(cron = "0 0/10 * * * ?")
    public void hTimer(){
        try {
            List<HurtOld> lists = hurtService.GetHurt();
            List<HurtNew> newList = hurtService.upHurtls(lists);
            if(newList.size() == 0){
                logger.info("查询完毕。");
                return;
            }
            for(int i=0;i<newList.size();i++) {
                hurtService.insertHurt(newList.get(i));
            }
            logger.info("插入成功");
        }catch (Exception ex){
            logger.error("失败"+ex.getMessage());
        }
    }
}
