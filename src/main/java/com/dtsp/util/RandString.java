package com.dtsp.util;

import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class RandString {
    public String RandStr() {
        String uuid = UUID.randomUUID().toString().replaceAll("-","").substring(0,15);
        return  uuid;
    }
}
