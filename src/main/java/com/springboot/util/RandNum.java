package com.springboot.util;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class RandNum {
    @Autowired
    Date date;
    public String RandStr(){
        String str = charStr(date.getTime()+"");
        if(str.length()<15){
            charStr(str);
        }
        return str;
    }

    public String charStr(String str){
        char a = (char)(Math.random()*26+97);
        str +=a;
        return  str;
    }
}
