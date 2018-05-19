package com.dtsp.timer;

import com.dtsp.ModelNew.CirrhosisNew;
import com.dtsp.ModelOld.CirrhosisOld;
import com.dtsp.service.CirrhosisService;
import com.dtsp.util.RandNumber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.RandomAccess;

@Component
public class CirrhosisTimer {
    private final Logger logger = LogManager.getLogger(CirrhosisTimer.class);
    @Autowired
    private RandNumber randNumber;
    @Autowired
    private CirrhosisService cirrhosisService;
   // @Scheduled(fixedRate = 10000)
    public synchronized void CirrhosisDemo(){
        try{
           List<CirrhosisOld> lists = cirrhosisService.GetCirrhosis();
           List<CirrhosisNew> newList = cirrhosisService.upCirrhosisls(lists);
           if(newList.size() == 0){
               logger.info("Cirrhosis查询为空");
               logger.error("Cirrhosis查询失败，未插入");
               return;
           }
           logger.info("Cirrhosis本次获取"+newList.size()+"条数据");
           for(int i=0;i<newList.size();i++) {
               newList.get(i).setID_No(randNumber.RandInt20());
               newList.get(i).setINF_ID(randNumber.RandStr15());
               cirrhosisService.insertCirrhosis(newList.get(i));
               logger.info("Cirrhosis插入成功");
               logger.info("插入数据："+newList.get(i));
           }
        }catch (Exception ex){
            logger.error("Cirrhosis异常日志");
            logger.error("失败"+ex.getMessage());
        }
    }
}
