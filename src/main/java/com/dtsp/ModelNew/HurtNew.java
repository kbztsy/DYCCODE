package com.dtsp.ModelNew;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class HurtNew {
    private String ID;
    private Long FID;
    private String SICK_NAME;
    private String SICK_SEX;
    private String NATION;
    private String ZONE_TYPE;
    private Date BIRTHDAY;
    private String OCCUPATION;
    private String ADDRESS;
    private String HARM_REASON;
    private String DELIBERATELY;
    private String HARM_PART;
    private String PART_OTHER_TEXT;
    private String TAKE_PLACE;
    private String SEVERITY;
    private Date OCCURRED_DATE;
    private Date CREATE_TIME;
    private String WRITE_DOCTOR;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Long getFID() {
        return FID;
    }

    public void setFID(Long FID) {
        this.FID = FID;
    }

    public Date getBIRTHDAY() {
        return BIRTHDAY;
    }

    public void setBIRTHDAY(Date BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }

    public Date getOCCURRED_DATE() {
        return OCCURRED_DATE;
    }

    public void setOCCURRED_DATE(Date OCCURRED_DATE) {
        this.OCCURRED_DATE = OCCURRED_DATE;
    }

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getSICK_NAME() {
        return SICK_NAME;
    }

    public void setSICK_NAME(String SICK_NAME) {
        this.SICK_NAME = SICK_NAME;
    }

    public String getSICK_SEX() {
        return SICK_SEX;
    }

    public void setSICK_SEX(String SICK_SEX) {
        this.SICK_SEX = SICK_SEX;
    }

    public String getNATION() {
        return NATION;
    }

    public void setNATION(String NATION) {
        this.NATION = NATION;
    }

    public String getZONE_TYPE() {
        return ZONE_TYPE;
    }

    public void setZONE_TYPE(String ZONE_TYPE) {
        this.ZONE_TYPE = ZONE_TYPE;
    }

    public String getOCCUPATION() {
        return OCCUPATION;
    }

    public void setOCCUPATION(String OCCUPATION) {
        this.OCCUPATION = OCCUPATION;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getHARM_REASON() {
        return HARM_REASON;
    }

    public void setHARM_REASON(String HARM_REASON) {
        this.HARM_REASON = HARM_REASON;
    }

    public String getDELIBERATELY() {
        return DELIBERATELY;
    }

    public void setDELIBERATELY(String DELIBERATELY) {
        this.DELIBERATELY = DELIBERATELY;
    }

    public String getHARM_PART() {
        return HARM_PART;
    }

    public void setHARM_PART(String HARM_PART) {
        this.HARM_PART = HARM_PART;
    }

    public String getPART_OTHER_TEXT() {
        return PART_OTHER_TEXT;
    }

    public void setPART_OTHER_TEXT(String PART_OTHER_TEXT) {
        this.PART_OTHER_TEXT = PART_OTHER_TEXT;
    }

    public String getTAKE_PLACE() {
        return TAKE_PLACE;
    }

    public void setTAKE_PLACE(String TAKE_PLACE) {
        this.TAKE_PLACE = TAKE_PLACE;
    }

    public String getSEVERITY() {
        return SEVERITY;
    }

    public void setSEVERITY(String SEVERITY) {
        this.SEVERITY = SEVERITY;
    }

    public String getWRITE_DOCTOR() {
        return WRITE_DOCTOR;
    }

    public void setWRITE_DOCTOR(String WRITE_DOCTOR) {
        this.WRITE_DOCTOR = WRITE_DOCTOR;
    }

    @Override
    public String toString() {
        return "HurtNew{" +
                "SICK_NAME='" + SICK_NAME + '\'' +
                ", SICK_SEX='" + SICK_SEX + '\'' +
                ", NATION='" + NATION + '\'' +
                ", ZONE_TYPE='" + ZONE_TYPE + '\'' +
                ", BIRTHDAY=" + BIRTHDAY +
                ", OCCUPATION='" + OCCUPATION + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", HARM_REASON='" + HARM_REASON + '\'' +
                ", DELIBERATELY='" + DELIBERATELY + '\'' +
                ", HARM_PART='" + HARM_PART + '\'' +
                ", PART_OTHER_TEXT='" + PART_OTHER_TEXT + '\'' +
                ", TAKE_PLACE='" + TAKE_PLACE + '\'' +
                ", SEVERITY='" + SEVERITY + '\'' +
                ", OCCURRED_DATE=" + OCCURRED_DATE +
                ", CREATE_TIME=" + CREATE_TIME +
                ", WRITE_DOCTOR='" + WRITE_DOCTOR + '\'' +
                '}';
    }
}

