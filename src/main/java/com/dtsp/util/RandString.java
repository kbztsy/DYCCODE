package com.dtsp.util;

import java.util.UUID;

public class RandString {
    public String RandStr() {
        String uuid = UUID.randomUUID().toString().substring(0,15);
        return  uuid;
    }
}
