package com.dtsp.util;

public class EqStr {
    public int RefStr(String str){
        int type=0;
        switch (str){
            case "吸烟":
                type = 1;
            break;
            case "已戒烟":
                type= 2;
                break;
            case "从不吸烟":
                type= 3;
                break;
                default:
                    type= 9;
        }
        return type;
    }
}
