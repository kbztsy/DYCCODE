package com.dtsp.ModelNew;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MentalNew {
    private String VISIT_NO;
    private String RESI_CASE_NO;
    private String SICK_NAME;
    private String SICK_SEX;
    private String NATION;
    private String OCCUPATION;
    private Date BIRTHDAY;
    private String ADDRESS;
    private String WORK_PLACE;
    private String FAMILY_HISTORY;
    private String DISPOSITION;
    private String PSYCHO;
    private String DIAGNOSECODE;
    private Date ACCIDENT_DATE;
    private String CCMD3_CODE;
    private String RECEPTION_ORG;
    private Date RECEPTION_TIME;
    private Date CREATE_TIME;
    private String WRITE_DOCTOR;

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

    public Date getBIRTHDAY() {
        return BIRTHDAY;
    }

    public void setBIRTHDAY(Date BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getWORK_PLACE() {
        return WORK_PLACE;
    }

    public void setWORK_PLACE(String WORK_PLACE) {
        this.WORK_PLACE = WORK_PLACE;
    }

    public String getFAMILY_HISTORY() {
        return FAMILY_HISTORY;
    }

    public void setFAMILY_HISTORY(String FAMILY_HISTORY) {
        this.FAMILY_HISTORY = FAMILY_HISTORY;
    }

    public String getDISPOSITION() {
        return DISPOSITION;
    }

    public void setDISPOSITION(String DISPOSITION) {
        this.DISPOSITION = DISPOSITION;
    }

    public String getPSYCHO() {
        return PSYCHO;
    }

    public void setPSYCHO(String PSYCHO) {
        this.PSYCHO = PSYCHO;
    }

    public String getDIAGNOSECODE() {
        return DIAGNOSECODE;
    }

    public void setDIAGNOSECODE(String DIAGNOSECODE) {
        this.DIAGNOSECODE = DIAGNOSECODE;
    }

    public Date getACCIDENT_DATE() {
        return ACCIDENT_DATE;
    }

    public void setACCIDENT_DATE(Date ACCIDENT_DATE) {
        this.ACCIDENT_DATE = ACCIDENT_DATE;
    }

    public String getCCMD3_CODE() {
        return CCMD3_CODE;
    }

    public void setCCMD3_CODE(String CCMD3_CODE) {
        this.CCMD3_CODE = CCMD3_CODE;
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

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    public String getWRITE_DOCTOR() {
        return WRITE_DOCTOR;
    }

    public void setWRITE_DOCTOR(String WRITE_DOCTOR) {
        this.WRITE_DOCTOR = WRITE_DOCTOR;
    }

    @Override
    public String toString() {
        return "MentalNew{" +
                "VISIT_NO='" + VISIT_NO + '\'' +
                ", RESI_CASE_NO='" + RESI_CASE_NO + '\'' +
                ", SICK_NAME='" + SICK_NAME + '\'' +
                ", SICK_SEX='" + SICK_SEX + '\'' +
                ", NATION='" + NATION + '\'' +
                ", OCCUPATION='" + OCCUPATION + '\'' +
                ", BIRTHDAY=" + BIRTHDAY +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", WORK_PLACE='" + WORK_PLACE + '\'' +
                ", FAMILY_HISTORY='" + FAMILY_HISTORY + '\'' +
                ", DISPOSITION='" + DISPOSITION + '\'' +
                ", PSYCHO='" + PSYCHO + '\'' +
                ", DIAGNOSECODE='" + DIAGNOSECODE + '\'' +
                ", ACCIDENT_DATE=" + ACCIDENT_DATE +
                ", CCMD3_CODE='" + CCMD3_CODE + '\'' +
                ", RECEPTION_ORG='" + RECEPTION_ORG + '\'' +
                ", RECEPTION_TIME=" + RECEPTION_TIME +
                ", CREATE_TIME=" + CREATE_TIME +
                ", WRITE_DOCTOR='" + WRITE_DOCTOR + '\'' +
                '}';
    }
}
