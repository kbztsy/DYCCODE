package com.dtsp.util;

import java.util.UUID;

public class RandString {
    public String RandStr() {
        String uuid = UUID.randomUUID().toString().replaceAll("-","").substring(0,15);
        return  uuid;
    }
}
