package com.dtsp.timer;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelNew.MentalNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.MentalOld;
import com.dtsp.service.MentalService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MentalTimer {
    private final Logger logger = LogManager.getLogger(MentalTimer.class);
    @Autowired
    private MentalService mentalService;
    @Scheduled(cron = "0 0/10 * * * ?")
    public void MenTimer(){
        try {
            List<MentalOld> lists = mentalService.getAllMental2();
            List<MentalNew> newList = mentalService.upMentalls(lists);
            if(newList.size() == 0){
                logger.info("查询完毕。");
                return;
            }
            for(int i=0;i<newList.size();i++) {
                mentalService.insertMental(newList.get(i));
            }
            logger.info("插入成功");
        }catch (Exception ex){
            logger.error("失败"+ex.getMessage());
        }
    }
}
