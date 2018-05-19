package com.dtsp.timer;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import com.dtsp.service.DisbetesService;
import com.dtsp.util.RandNumber;
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
    private RandNumber randNumber;
    @Autowired
    private DisbetesService disbetesService;
   // @Scheduled(cron = "0 0/10 * * * ?")
  // @Scheduled(fixedRate = 2000)
   //@Scheduled(fixedRate = 10000)
    public synchronized void DisbetesDemo(){
        try{
            List<DiabetesOld> lists = disbetesService.GetDisbetes();
            List<DiabetesNew> newList = disbetesService.upCirrhosisls(lists);
            if(newList.size() == 0){
                logger.info("Disbetes查询为空");
                logger.error("Disbetes查询失败，未插入");
                return;
            }
            logger.info("Disbetes本次获取"+newList.size()+"条数据");
            for(int i=0;i<newList.size();i++) {
                newList.get(i).setID(randNumber.RandInt20());
                newList.get(i).setINF_ID(randNumber.RandStr15());
                disbetesService.insertDisbetes(newList.get(i));
                logger.info("Disbetes插入成功");
                logger.info("插入数据："+newList.get(i));
            }
        }catch (Exception ex){
            logger.error("Disbetes异常日志");
            logger.error("失败"+ex.getMessage());
        }
    }
}
