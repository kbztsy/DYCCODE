package com.dtsp.ModelNew;
import com.dtsp.util.RandNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class InfectiousNew {
    @Autowired
    private RandNumber randNumber;
    private String INF_ID;
    private BigDecimal ID;
    private String VISIT_NO;// 门诊住院号
    private String RESI_CASE_NO;
    private String SICK_NAME;// 患者姓名
    private String SICK_PARENT_NAME;//患儿家长姓名
    private String IDENTITY_CARD_NO;//身份证号
    private String  SICK_SEX;// 性别
    private Date BIRTHDAY;//出生日期
    private String SICK_PHONE;//联系电话
    private String WORK_PLACE;// 工作单位
    private String SICK_BELONG;//病人属于
    private String ADDRESS;//现住址（详填）
    private String OCCUPATION;//患者职业
    private String DIAGNOSIS_TYPE_CODE;//疾病分类
    private String CASETYPE;//病例类型
    private Date ACCIDENT_DATE;//发病日期
    private Date DIAGNOSE_DATE;//   诊断日期
    private Date DEATH_DATE;//死亡日期
    private String WRITE_DOCTOR;//填报医生
    private Date CREATE_TIME;//医生填卡日期

    public BigDecimal getID() {
        return ID;
    }

    public String getINF_ID() {
        return INF_ID;
    }

    public void setINF_ID(String INF_ID) {
        this.INF_ID = INF_ID;
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

    public String getSICK_PARENT_NAME() {
        return SICK_PARENT_NAME;
    }

    public void setSICK_PARENT_NAME(String SICK_PARENT_NAME) {
        this.SICK_PARENT_NAME = SICK_PARENT_NAME;
    }

    public String getIDENTITY_CARD_NO() {
        return IDENTITY_CARD_NO;
    }

    public void setIDENTITY_CARD_NO(String IDENTITY_CARD_NO) {
        this.IDENTITY_CARD_NO = IDENTITY_CARD_NO;
    }

    public String getSICK_SEX() {
        return SICK_SEX;
    }

    public void setSICK_SEX(String SICK_SEX) {
        this.SICK_SEX = SICK_SEX;
    }

    public Date getBIRTHDAY() {
        return BIRTHDAY;
    }

    public void setBIRTHDAY(Date BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }

    public String getSICK_PHONE() {
        return SICK_PHONE;
    }

    public void setSICK_PHONE(String SICK_PHONE) {
        this.SICK_PHONE = SICK_PHONE;
    }

    public String getWORK_PLACE() {
        return WORK_PLACE;
    }

    public void setWORK_PLACE(String WORK_PLACE) {
        this.WORK_PLACE = WORK_PLACE;
    }

    public String getSICK_BELONG() {
        return SICK_BELONG;
    }

    public void setSICK_BELONG(String SICK_BELONG) {
        this.SICK_BELONG = SICK_BELONG;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getOCCUPATION() {
        return OCCUPATION;
    }

    public void setOCCUPATION(String OCCUPATION) {
        this.OCCUPATION = OCCUPATION;
    }

    public String getDIAGNOSIS_TYPE_CODE() {
        return DIAGNOSIS_TYPE_CODE;
    }

    public void setDIAGNOSIS_TYPE_CODE(String DIAGNOSIS_TYPE_CODE) {
        this.DIAGNOSIS_TYPE_CODE = DIAGNOSIS_TYPE_CODE;
    }

    public String getCASETYPE() {
        return CASETYPE;
    }

    public void setCASETYPE(String CASETYPE) {
        this.CASETYPE = CASETYPE;
    }

    public Date getACCIDENT_DATE() {
        return ACCIDENT_DATE;
    }

    public void setACCIDENT_DATE(Date ACCIDENT_DATE) {
        this.ACCIDENT_DATE = ACCIDENT_DATE;
    }

    public Date getDIAGNOSE_DATE() {
        return DIAGNOSE_DATE;
    }

    public void setDIAGNOSE_DATE(Date DIAGNOSE_DATE) {
        this.DIAGNOSE_DATE = DIAGNOSE_DATE;
    }

    public Date getDEATH_DATE() {
        return DEATH_DATE;
    }

    public void setDEATH_DATE(Date DEATH_DATE) {
        this.DEATH_DATE = DEATH_DATE;
    }

    public String getWRITE_DOCTOR() {
        return WRITE_DOCTOR;
    }

    public void setWRITE_DOCTOR(String WRITE_DOCTOR) {
        this.WRITE_DOCTOR = WRITE_DOCTOR;
    }

    public Date getCREATE_TIME() {
        return CREATE_TIME;
    }

    public void setCREATE_TIME(Date CREATE_TIME) {
        this.CREATE_TIME = CREATE_TIME;
    }

    @Override
    public String toString() {
        return "InfectiousNew{" +
                "VISIT_NO='" + VISIT_NO + '\'' +
                ", RESI_CASE_NO='" + RESI_CASE_NO + '\'' +
                ", SICK_NAME='" + SICK_NAME + '\'' +
                ", SICK_PARENT_NAME='" + SICK_PARENT_NAME + '\'' +
                ", IDENTITY_CARD_NO='" + IDENTITY_CARD_NO + '\'' +
                ", SICK_SEX='" + SICK_SEX + '\'' +
                ", BIRTHDAY=" + BIRTHDAY +
                ", SICK_PHONE='" + SICK_PHONE + '\'' +
                ", WORK_PLACE='" + WORK_PLACE + '\'' +
                ", SICK_BELONG='" + SICK_BELONG + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", OCCUPATION='" + OCCUPATION + '\'' +
                ", DIAGNOSIS_TYPE_CODE='" + DIAGNOSIS_TYPE_CODE + '\'' +
                ", CASETYPE='" + CASETYPE + '\'' +
                ", ACCIDENT_DATE=" + ACCIDENT_DATE +
                ", DIAGNOSE_DATE=" + DIAGNOSE_DATE +
                ", DEATH_DATE=" + DEATH_DATE +
                ", WRITE_DOCTOR='" + WRITE_DOCTOR + '\'' +
                ", CREATE_TIME=" + CREATE_TIME +
                '}';
    }
}
