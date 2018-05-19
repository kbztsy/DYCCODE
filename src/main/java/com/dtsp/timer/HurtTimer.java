package com.dtsp.timer;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelNew.HurtNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.HurtOld;
import com.dtsp.service.HurtService;
import com.dtsp.util.RandNumber;
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
    @Autowired
    private RandNumber randNumber;
 //   @Scheduled(cron = "0 0/10 * * * ?")
    //@Scheduled(fixedRate = 10000)

    public synchronized void HurtDemo(){
        try{
            List<HurtOld> lists = hurtService.GetHurt();
            List<HurtNew> newList = hurtService.upHurtls(lists);
            if(newList.size() == 0){
                logger.info("Hurt查询为空");
                logger.error("Hurt查询失败，未插入");
                return;
            }
            logger.info("Hurt本次获取"+newList.size()+"条数据");
            for(int i=0;i<newList.size();i++) {
                newList.get(i).setID(randNumber.RandInt20());
                newList.get(i).setINF_ID(randNumber.RandStr15());
                hurtService.insertHurt(newList.get(i));
                logger.info("Hurt插入成功");
                logger.info("插入数据："+newList.get(i));
            }
        }catch (Exception ex){
            logger.error("Hurt异常日志");
            logger.error("失败"+ex.getMessage());
        }
    }
}
