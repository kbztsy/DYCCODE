package com.dtsp.timer;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelNew.NauseaNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.ModelOld.NauseaOld;
import com.dtsp.service.NauseaService;
import com.dtsp.util.RandNumber;
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
    @Autowired
    private RandNumber randNumber;
   // @Scheduled(cron = "0 0/10 * * * ?")
   //@Scheduled(fixedRate = 10000)
    public synchronized void CirrhosisDemo(){
        try{
            List<NauseaOld> lists = nauseaService.getAllNausea2();
            List<NauseaNew> newList = nauseaService.upNauseals(lists);
            if(newList.size() == 0){
                logger.info("Nausea查询为空");
                logger.error("Nausea查询失败，未插入");
                return;
            }
            logger.info("Nausea本次获取"+newList.size()+"条数据");
            for(int i=0;i<newList.size();i++) {
                newList.get(i).setID(randNumber.RandInt20());
                newList.get(i).setINF_ID(randNumber.RandStr15());
                nauseaService.insertNausea(newList.get(i));
                logger.info("Nausea插入成功");
                logger.info("插入数据："+newList.get(i));
            }
        }catch (Exception ex){
            logger.error("Nausea异常日志");
            logger.error("失败"+ex.getMessage());
        }
    }
}
