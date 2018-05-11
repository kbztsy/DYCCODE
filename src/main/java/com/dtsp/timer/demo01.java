package com.dtsp.timer;

import com.dtsp.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;


@Component
public class demo01 {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void test(){
        String uuid = UUID.randomUUID().toString().substring(0,15);
        System.out.println(uuid);
    }
}
