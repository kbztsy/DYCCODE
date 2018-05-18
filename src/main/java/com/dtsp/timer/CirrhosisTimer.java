package com.dtsp.timer;

import com.dtsp.ModelNew.CirrhosisNew;
import com.dtsp.ModelOld.CirrhosisOld;
import com.dtsp.service.CirrhosisService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CirrhosisTimer {
    private final Logger logger = LogManager.getLogger(CirrhosisTimer.class);
    @Autowired
    private CirrhosisService cirrhosisService;
    @Scheduled(fixedRate = 2000)
    public void CirrhosisDemo(){
        try{
           List<CirrhosisOld> lists = cirrhosisService.GetCirrhosis();
           List<CirrhosisNew> newList = cirrhosisService.upCirrhosisls(lists);
           if(newList.size() == 0){
               logger.info("Cirrhosis查询为空");
               return;
           }
           for(int i=0;i<newList.size();i++) {
               cirrhosisService.insertCirrhosis(newList.get(i));
               logger.info("插入数据："+newList.get(i));
               logger.info("插入成功");
           }
        }catch (Exception ex){
            logger.error("异常日志");
            logger.error("失败"+ex.getMessage());
        }
    }
}
