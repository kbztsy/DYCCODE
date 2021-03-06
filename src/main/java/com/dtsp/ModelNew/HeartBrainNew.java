package com.dtsp.ModelNew;
import com.dtsp.util.RandNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class HeartBrainNew {
    @Autowired
    private RandNumber randNumber;
    private String INF_ID;
    private BigDecimal ID;
    private String VISIT_NO;
    private String RESI_CASE_NO;
    private String SICK_NAME;
    private String SICK_SEX;
    private String NATION;
    private String OCCUPATION;
    private Date BIRTHDAY;
    private String ADDRESS;
    private Integer SMOKING;
    private String DIAGNOSECODE;
    private String DIAGNOSISBASIS;
    private String DIAGNOSISBASISOTHER;
    private String RECEPTION_ORG;
    private Date RECEPTION_TIME;
    private Date CREATE_TIME;
    private String WRITE_DOCTOR;
    private String BKLX_ID;

    public String getBKLX_ID() {
        return BKLX_ID;
    }

    public void setBKLX_ID(String BKLX_ID) {
        this.BKLX_ID = BKLX_ID;
    }
    public String getINF_ID() {
        return INF_ID;
    }

    public void setINF_ID(String INF_ID) {
        this.INF_ID = INF_ID;
    }

    public BigDecimal getID() {
        return ID;
    }

    public void setID(BigDecimal ID) {
        this.ID = ID;
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

    public Integer getSMOKING() {
        return SMOKING;
    }

    public void setSMOKING(Integer SMOKING) {
        this.SMOKING = SMOKING;
    }

    public String getDIAGNOSECODE() {
        return DIAGNOSECODE;
    }

    public void setDIAGNOSECODE(String DIAGNOSECODE) {
        this.DIAGNOSECODE = DIAGNOSECODE;
    }

    public String getDIAGNOSISBASIS() {
        return DIAGNOSISBASIS;
    }

    public void setDIAGNOSISBASIS(String DIAGNOSISBASIS) {
        this.DIAGNOSISBASIS = DIAGNOSISBASIS;
    }

    public String getDIAGNOSISBASISOTHER() {
        return DIAGNOSISBASISOTHER;
    }

    public void setDIAGNOSISBASISOTHER(String DIAGNOSISBASISOTHER) {
        this.DIAGNOSISBASISOTHER = DIAGNOSISBASISOTHER;
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
        return "HeartBrainNew{" +
                "INF_ID='" + INF_ID + '\'' +
                ", ID=" + ID +
                ", VISIT_NO='" + VISIT_NO + '\'' +
                ", RESI_CASE_NO='" + RESI_CASE_NO + '\'' +
                ", SICK_NAME='" + SICK_NAME + '\'' +
                ", SICK_SEX='" + SICK_SEX + '\'' +
                ", NATION='" + NATION + '\'' +
                ", OCCUPATION='" + OCCUPATION + '\'' +
                ", BIRTHDAY=" + BIRTHDAY +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", SMOKING=" + SMOKING +
                ", DIAGNOSECODE='" + DIAGNOSECODE + '\'' +
                ", DIAGNOSISBASIS='" + DIAGNOSISBASIS + '\'' +
                ", DIAGNOSISBASISOTHER='" + DIAGNOSISBASISOTHER + '\'' +
                ", RECEPTION_ORG='" + RECEPTION_ORG + '\'' +
                ", RECEPTION_TIME=" + RECEPTION_TIME +
                ", CREATE_TIME=" + CREATE_TIME +
                ", WRITE_DOCTOR='" + WRITE_DOCTOR + '\'' +
                '}';
    }
}
