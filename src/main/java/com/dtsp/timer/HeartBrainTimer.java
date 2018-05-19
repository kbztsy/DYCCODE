package com.dtsp.timer;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelOld.DiabetesOld;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.service.HeartBrainService;
import com.dtsp.util.RandNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HeartBrainTimer {
    @Autowired
    private RandNumber randNumber;
    private final Logger logger = LogManager.getLogger(HeartBrainTimer.class);
    @Autowired
    private HeartBrainService heartBrainService;
    //  @Scheduled(cron = "0 0/10 * * * ?")
     @Scheduled(fixedRate = 10000)

    public synchronized void HeartBrainDemo() {
        try {
            List<HeartBrainOld> lists = heartBrainService.GetHeartBrain();
            List<HeartBrainNew> newList = heartBrainService.upHeartBrainls(lists);
            if (newList.size() == 0) {
                logger.info("HeartBrain查询为空");
                logger.error("HeartBrain查询失败，未插入");
                return;
            }
            logger.info("HeartBrain本次获取" + newList.size() + "条数据");
            for (int i = 0; i < newList.size(); i++) {
                newList.get(i).setID(randNumber.RandInt20());
                newList.get(i).setINF_ID(randNumber.RandStr15());
                heartBrainService.insertHeartBrain(newList.get(i));
                logger.info("HeartBrain插入成功");
                logger.info("插入数据：" + newList.get(i));
            }
        } catch (Exception ex) {
            logger.error("HeartBrain异常日志");
            logger.error("失败" + ex.getMessage());
        }
    }
}