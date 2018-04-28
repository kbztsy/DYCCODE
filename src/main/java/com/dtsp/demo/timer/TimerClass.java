package com.dtsp.demo.timer;

import com.dtsp.demo.controller.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@Configuration
@PropertySource(value = {"classpath:url.properties"},encoding="utf-8")
@EnableScheduling
public class TimerClass {
    private Logger logger = LoggerFactory.getLogger(TimerClass.class);
    @Autowired
    TimerClass timerClass;
    @Value("${HospitalIP1}")
    private String HospitalIP1;
    @Value("${HospitalIP2}")
    private String HospitalIP2;
    @Value("${HospitalIP3}")
    private String HospitalIP3;
    @Value("${HospitalIP4}")
    private String HospitalIP4;
    @Value("${HospitalIP5}")
    private String HospitalIP5;
    @Value("${HospitalIP6}")
    private String HospitalIP6;
    @Value("${HospitalIP7}")
    private String HospitalIP7;
    @Value("${HospitalIP8}")
    private String HospitalIP8;
    @Value("${HospitalIP9}")
    private String HospitalIP9;
    @Value("${HospitalIP10}")
    private String HospitalIP10;
    @Value("${HospitalIP11}")
    private String HospitalIP11;
    @Value("${HospitalIP12}")
    private String HospitalIP12;
    @Value("${HospitalIP13}")
    private String HospitalIP13;
    @Value("${HospitalIP14}")
    private String HospitalIP14;
    @Value("${HospitalIP15}")
    private String HospitalIP15;
    @Value("${HospitalIP16}")
    private String HospitalIP16;
    @Value("${HospitalIP17}")
    private String HospitalIP17;
    @Value("${HospitalIP18}")
    private String HospitalIP18;
    @Value("${HospitalIP19}")
    private String HospitalIP19;
    @Value("${HospitalIP20}")
    private String HospitalIP20;

    @Scheduled(cron = "0 0/1 * * * ?")
    public void demo(){
        String[] hospitalIPs = new String[20];
        hospitalIPs = timerClass.Strs(hospitalIPs);
        for(int i = 0;i<hospitalIPs.length;i++){
            logger.info("第"+(i+1)+"家医院IP："+hospitalIPs[i].trim().length());
            if(hospitalIPs[i].trim().length()> 1){
                logger.info("第"+(i+1)+"家医院IP："+hospitalIPs[i]);
            }else {
                logger.info("第"+(i+1)+"家医院IP：暂未设置");
                logger.error("ERROR:暂未设置");
            }
        }
    }
    private String[] Strs(String[] strings){
        String[] hospitalIPs = new String[20];
        hospitalIPs[0] = HospitalIP1;
        hospitalIPs[1] = HospitalIP2;
        hospitalIPs[2] = HospitalIP3;
        hospitalIPs[3] = HospitalIP4;
        hospitalIPs[4] = HospitalIP5;
        hospitalIPs[5] = HospitalIP6;
        hospitalIPs[6] = HospitalIP7;
        hospitalIPs[7] = HospitalIP8;
        hospitalIPs[8] = HospitalIP9;
        hospitalIPs[9] = HospitalIP10;
        hospitalIPs[10] = HospitalIP11;
        hospitalIPs[11] = HospitalIP12;
        hospitalIPs[12] = HospitalIP13;
        hospitalIPs[13] = HospitalIP14;
        hospitalIPs[14] = HospitalIP15;
        hospitalIPs[15] = HospitalIP16;
        hospitalIPs[16] = HospitalIP17;
        hospitalIPs[17] = HospitalIP18;
        hospitalIPs[18] = HospitalIP19;
        hospitalIPs[19] = HospitalIP20;
        return hospitalIPs;
    }

}
