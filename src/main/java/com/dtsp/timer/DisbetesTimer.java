package com.dtsp.timer;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import com.dtsp.service.DisbetesService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DisbetesTimer {
    private final Logger logger = LogManager.getLogger(DisbetesTimer.class);
    @Autowired
    private DisbetesService disbetesService;
    @Scheduled(cron = "0 0/10 * * * ?")
    public void DisTimer(){
        try{
            List<DiabetesOld> lists = disbetesService.GetDisbetes();
            List<DiabetesNew> newList = disbetesService.upCirrhosisls(lists);
            if(newList.size() == 0){
                logger.info("查询完毕。");
                return;
            }
            for(int i=0;i<newList.size();i++) {
                disbetesService.insertDisbetes(newList.get(i));
            }
            logger.info("插入成功");
        }catch (Exception ex) {
            logger.error("失败" + ex.getMessage());
        }
    }
}
