package com.springboot.util;

import java.util.UUID;

public class RandNum {
    public String RandStr() {
        String uuid = UUID.randomUUID().toString().substring(0,15);
        return  uuid;
    }
}
