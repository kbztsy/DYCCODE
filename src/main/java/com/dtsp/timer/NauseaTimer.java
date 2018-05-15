package com.dtsp.timer;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelNew.NauseaNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.NauseaOld;
import com.dtsp.service.NauseaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NauseaTimer {
    private final Logger logger = LogManager.getLogger(NauseaTimer.class);
    @Autowired
    private NauseaService nauseaService;
    @Scheduled(cron = "0 0/10 * * * ?")
    public void NaTimer(){
        try {
            List<NauseaOld> lists = nauseaService.getAllNausea2();
            List<NauseaNew> newList = nauseaService.upNauseals(lists);
            if(newList.size() == 0){
                logger.info("查询完毕。");
                return;
            }
            for(int i=0;i<newList.size();i++) {
                nauseaService.insertNausea(newList.get(i));
            }
            logger.info("插入成功");
        }catch (Exception ex) {
            logger.error("失败" + ex.getMessage());
        }
    }
}
