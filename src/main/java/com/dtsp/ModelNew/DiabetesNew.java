package com.dtsp.ModelNew;

import com.dtsp.util.RandNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class DiabetesNew {
    @Autowired
    private RandNumber randNumber;
    private String ID;
    private BigDecimal FID;
    private String  VISIT_NO;//   门诊住院号
    private String RESI_CASE_NO;
    private String	SICK_NAME;//  患者姓名
    private String	SICK_SEX;//    性别
    private String	NATION;//    民族
    private String	OCCUPATION;//    职业
    private Date	BIRTHDAY;// 出生日期
    private String	ADDRESS;//  现住址
    private String	DIAGNOSECODE;//    诊断
    private String DIAGNOSISBASISOTHER;
    private String COMPLICATIONS;//    合并症
    private String ICD_10_TEXT;// ICD--10
    private String	RECEPTION_ORG;//    诊断单位
    private Date RECEPTION_TIME;//诊断日期
    private Date	CREATE_TIME;//  填报日期
    private String	 WRITE_DOCTOR;//  填报医生

    public String getID() {
        return randNumber.RandStr15();
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public BigDecimal getFID() {
        return randNumber.RandInt20();
    }

    public void setFID(BigDecimal FID) {
        this.FID = FID;
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
        return "DiabetesNew{" +
                "VISIT_NO='" + VISIT_NO + '\'' +
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
                ", CREATE_TIME=" + CREATE_TIME +
                ", WRITE_DOCTOR='" + WRITE_DOCTOR + '\'' +
                '}';
    }
}
