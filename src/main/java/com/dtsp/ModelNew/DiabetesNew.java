package com.dtsp.ModelNew;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DiabetesNew {
    private String INF_ID=11111112+"";
    private String  VISIT_NO ="131";//   门诊住院号
    private String RESI_CASE_NO = "11232432";
    private String	SICK_NAME ="张三";//  患者姓名
    private String	SICK_SEX;//    性别
    private String	NATION;//    民族
    private String	OCCUPATION;//    职业
    private String BIRTHDAY = "2018-01-01";// 出生日期
    private String	ADDRESS;//  现住址
    private String	DIAGNOSECODE;//    诊断
    private String DIAGNOSISBASISOTHER;
    private String 	COMPLICATIONS;//    合并症
    private String ICD_10_TEXT;// ICD--10
    private String	RECEPTION_ORG;//    诊断单位
    private Date RECEPTION_TIME = new Date();//诊断日期
    private String	tbdw;//    填报单位
    private Date	date_of_tb;//  填报日期
    private String	 WRITE_DOCTOR;//  填报医生

    public String getINF_ID() {
        return INF_ID;
    }

    public void setINF_ID(String INF_ID) {
        this.INF_ID = INF_ID;
    }

    public String getVISIT_NO() {
        return VISIT_NO;
    }

    public void setVISIT_NO(String VISIT_NO) {
        this.VISIT_NO = VISIT_NO;
    }

    public String getRESI_CASE_NO() {
        return RESI_CASE_NO;
    }

    public void setRESI_CASE_NO(String RESI_CASE_NO) {
        this.RESI_CASE_NO = RESI_CASE_NO;
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

    public String getOCCUPATION() {
        return OCCUPATION;
    }

    public void setOCCUPATION(String OCCUPATION) {
        this.OCCUPATION = OCCUPATION;
    }

    public String getBIRTHDAY() {
        return BIRTHDAY;
    }

    public void setBIRTHDAY(String BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getDIAGNOSECODE() {
        return DIAGNOSECODE;
    }

    public void setDIAGNOSECODE(String DIAGNOSECODE) {
        this.DIAGNOSECODE = DIAGNOSECODE;
    }

    public String getDIAGNOSISBASISOTHER() {
        return DIAGNOSISBASISOTHER;
    }

    public void setDIAGNOSISBASISOTHER(String DIAGNOSISBASISOTHER) {
        this.DIAGNOSISBASISOTHER = DIAGNOSISBASISOTHER;
    }

    public String getCOMPLICATIONS() {
        return COMPLICATIONS;
    }

    public void setCOMPLICATIONS(String COMPLICATIONS) {
        this.COMPLICATIONS = COMPLICATIONS;
    }

    public String getICD_10_TEXT() {
        return ICD_10_TEXT;
    }

    public void setICD_10_TEXT(String ICD_10_TEXT) {
        this.ICD_10_TEXT = ICD_10_TEXT;
    }

    public String getRECEPTION_ORG() {
        return RECEPTION_ORG;
    }

    public void setRECEPTION_ORG(String RECEPTION_ORG) {
        this.RECEPTION_ORG = RECEPTION_ORG;
    }

    public Date getRECEPTION_TIME() {
        return RECEPTION_TIME;
    }

    public void setRECEPTION_TIME(Date RECEPTION_TIME) {
        this.RECEPTION_TIME = RECEPTION_TIME;
    }

    public String getTbdw() {
        return tbdw;
    }

    public void setTbdw(String tbdw) {
        this.tbdw = tbdw;
    }

    public Date getDate_of_tb() {
        return date_of_tb;
    }

    public void setDate_of_tb(Date date_of_tb) {
        this.date_of_tb = date_of_tb;
    }

    public String getWRITE_DOCTOR() {
        return WRITE_DOCTOR;
    }

    public void setWRITE_DOCTOR(String WRITE_DOCTOR) {
        this.WRITE_DOCTOR = WRITE_DOCTOR;
    }

    @Override
    public String toString() {
        return "DiabetesNew{" +
                "INF_ID=" + INF_ID +
                ", VISIT_NO='" + VISIT_NO + '\'' +
                ", RESI_CASE_NO='" + RESI_CASE_NO + '\'' +
                ", SICK_NAME='" + SICK_NAME + '\'' +
                ", SICK_SEX='" + SICK_SEX + '\'' +
                ", NATION='" + NATION + '\'' +
                ", OCCUPATION='" + OCCUPATION + '\'' +
                ", BIRTHDAY=" + BIRTHDAY +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", DIAGNOSECODE='" + DIAGNOSECODE + '\'' +
                ", DIAGNOSISBASISOTHER='" + DIAGNOSISBASISOTHER + '\'' +
                ", COMPLICATIONS='" + COMPLICATIONS + '\'' +
                ", ICD_10_TEXT='" + ICD_10_TEXT + '\'' +
                ", RECEPTION_ORG='" + RECEPTION_ORG + '\'' +
                ", RECEPTION_TIME=" + RECEPTION_TIME +
                ", tbdw='" + tbdw + '\'' +
                ", date_of_tb=" + date_of_tb +
                ", WRITE_DOCTOR='" + WRITE_DOCTOR + '\'' +
                '}';
    }
}
