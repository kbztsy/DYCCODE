package com.springboot.util;

import java.util.Map;

public class RandNumber {
    public Long Randint(){
        String intStr = "";
        for(int i =0; i<10;i++){
          int in = (int)(Math.random()*9);
            intStr +=in;
        }
      return Long.parseLong(intStr);
    }
}
