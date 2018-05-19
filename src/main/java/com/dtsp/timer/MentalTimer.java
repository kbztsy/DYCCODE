package com.dtsp.timer;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelNew.MentalNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.MentalOld;
import com.dtsp.service.MentalService;
import com.dtsp.util.RandNumber;
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
    @Autowired
    private RandNumber randNumber;
  //  @Scheduled(cron = "0 0/10 * * * ?")
 // @Scheduled(fixedRate = 10000)
    public synchronized void MentalDemo(){
        try{
            List<MentalOld> lists = mentalService.getAllMental2();
            List<MentalNew> newList = mentalService.upMentalls(lists);
            if(newList.size() == 0){
                logger.info("Mental查询为空");
                logger.error("Mental查询失败，未插入");
                return;
            }
            logger.info("Mental本次获取"+newList.size()+"条数据");
            for(int i=0;i<newList.size();i++) {
                newList.get(i).setID(randNumber.RandInt20());
                newList.get(i).setINF_ID(randNumber.RandStr15());
                mentalService.insertMental(newList.get(i));
                logger.info("Mental插入成功");
                logger.info("插入数据："+newList.get(i));
            }
        }catch (Exception ex){
            logger.error("Mental异常日志");
            logger.error("失败"+ex.getMessage());
        }
    }
}
