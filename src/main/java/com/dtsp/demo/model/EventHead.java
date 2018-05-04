package com.dtsp.demo.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EventHead {
    Date date=new Date();
    SimpleDateFormat sdf=new SimpleDateFormat("YYYYMMddHHmmss");
     private String eventId="9位机构编码"+sdf.format(date)+"3位流水号";
     private String entityName="IDR_NCD_CODRIS";
     private String operateType="Add";


    public String getEventId() {
        return eventId;
    }
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }
}
