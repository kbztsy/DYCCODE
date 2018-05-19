package com.dtsp.ModelNew;
import com.dtsp.util.RandNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class NauseaNew {
    private String INF_ID;
    private BigDecimal ID;
    private String VISIT_NO;
    private String RESI_CASE_NO;
    private String SICK_NAME;
    private String SICK_SEX;
    private String NATION;
    private String OCCUPATION;
    private Date BIRTHDAY;
    private String MARRIAGE;
    private String IDENTITY_CARD_NO;
    private String ADDRESS;
    private String RESIDENCE_ADDRESS;
    private Integer SMOKING;
    private String PATHOLOGIC_TYPES;
    private String DIAGNOSIS_T;
    private String DIAGNOSIS_N;
    private String DIAGNOSIS_M;
    private String DIAGNOSIS_NO;
    private String ICD_10;
    private String ICD_10_TEXT;
    private String CLINICAL_STAGE;
    private String ICD_03;
    private String ICD_03_TEXT;
    private String DIFFERENTIAL_DEGREE;
    private String RECEPTION_ORG;
    private Date RECEPTION_TIME;
    private Date CREATE_TIME;
    private String WRITE_DOCTOR;
    private String DIAGNOSECODE;
    private String DIAGNOSISBASIS;
    private String DIAGNOSISBASISOTHER;
    private String DETAILED_DIAGNOSIS;

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

    public String getMARRIAGE() {
        return MARRIAGE;
    }

    public void setMARRIAGE(String MARRIAGE) {
        this.MARRIAGE = MARRIAGE;
    }

    public String getIDENTITY_CARD_NO() {
        return IDENTITY_CARD_NO;
    }

    public void setIDENTITY_CARD_NO(String IDENTITY_CARD_NO) {
        this.IDENTITY_CARD_NO = IDENTITY_CARD_NO;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getRESIDENCE_ADDRESS() {
        return RESIDENCE_ADDRESS;
    }

    public void setRESIDENCE_ADDRESS(String RESIDENCE_ADDRESS) {
        this.RESIDENCE_ADDRESS = RESIDENCE_ADDRESS;
    }

    public Integer getSMOKING() {
        return SMOKING;
    }

    public void setSMOKING(Integer SMOKING) {
        this.SMOKING = SMOKING;
    }

    public String getPATHOLOGIC_TYPES() {
        return PATHOLOGIC_TYPES;
    }

    public void setPATHOLOGIC_TYPES(String PATHOLOGIC_TYPES) {
        this.PATHOLOGIC_TYPES = PATHOLOGIC_TYPES;
    }

    public String getDIAGNOSIS_T() {
        return DIAGNOSIS_T;
    }

    public void setDIAGNOSIS_T(String DIAGNOSIS_T) {
        this.DIAGNOSIS_T = DIAGNOSIS_T;
    }

    public String getDIAGNOSIS_N() {
        return DIAGNOSIS_N;
    }

    public void setDIAGNOSIS_N(String DIAGNOSIS_N) {
        this.DIAGNOSIS_N = DIAGNOSIS_N;
    }

    public String getDIAGNOSIS_M() {
        return DIAGNOSIS_M;
    }

    public void setDIAGNOSIS_M(String DIAGNOSIS_M) {
        this.DIAGNOSIS_M = DIAGNOSIS_M;
    }

    public String getDIAGNOSIS_NO() {
        return DIAGNOSIS_NO;
    }

    public void setDIAGNOSIS_NO(String DIAGNOSIS_NO) {
        this.DIAGNOSIS_NO = DIAGNOSIS_NO;
    }

    public String getICD_10() {
        return ICD_10;
    }

    public void setICD_10(String ICD_10) {
        this.ICD_10 = ICD_10;
    }

    public String getICD_10_TEXT() {
        return ICD_10_TEXT;
    }

    public void setICD_10_TEXT(String ICD_10_TEXT) {
        this.ICD_10_TEXT = ICD_10_TEXT;
    }

    public String getCLINICAL_STAGE() {
        return CLINICAL_STAGE;
    }

    public void setCLINICAL_STAGE(String CLINICAL_STAGE) {
        this.CLINICAL_STAGE = CLINICAL_STAGE;
    }

    public String getICD_03() {
        return ICD_03;
    }

    public void setICD_03(String ICD_03) {
        this.ICD_03 = ICD_03;
    }

    public String getICD_03_TEXT() {
        return ICD_03_TEXT;
    }

    public void setICD_03_TEXT(String ICD_03_TEXT) {
        this.ICD_03_TEXT = ICD_03_TEXT;
    }

    public String getDIFFERENTIAL_DEGREE() {
        return DIFFERENTIAL_DEGREE;
    }

    public void setDIFFERENTIAL_DEGREE(String DIFFERENTIAL_DEGREE) {
        this.DIFFERENTIAL_DEGREE = DIFFERENTIAL_DEGREE;
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

    public String getDETAILED_DIAGNOSIS() {
        return DETAILED_DIAGNOSIS;
    }

    public void setDETAILED_DIAGNOSIS(String DETAILED_DIAGNOSIS) {
        this.DETAILED_DIAGNOSIS = DETAILED_DIAGNOSIS;
    }

    @Override
    public String toString() {
        return "NauseaNew{" +
                "INF_ID='" + INF_ID + '\'' +
                ", ID=" + ID +
                ", VISIT_NO='" + VISIT_NO + '\'' +
                ", RESI_CASE_NO='" + RESI_CASE_NO + '\'' +
                ", SICK_NAME='" + SICK_NAME + '\'' +
                ", SICK_SEX='" + SICK_SEX + '\'' +
                ", NATION='" + NATION + '\'' +
                ", OCCUPATION='" + OCCUPATION + '\'' +
                ", BIRTHDAY=" + BIRTHDAY +
                ", MARRIAGE='" + MARRIAGE + '\'' +
                ", IDENTITY_CARD_NO='" + IDENTITY_CARD_NO + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                ", RESIDENCE_ADDRESS='" + RESIDENCE_ADDRESS + '\'' +
                ", SMOKING=" + SMOKING +
                ", PATHOLOGIC_TYPES='" + PATHOLOGIC_TYPES + '\'' +
                ", DIAGNOSIS_T='" + DIAGNOSIS_T + '\'' +
                ", DIAGNOSIS_N='" + DIAGNOSIS_N + '\'' +
                ", DIAGNOSIS_M='" + DIAGNOSIS_M + '\'' +
                ", DIAGNOSIS_NO='" + DIAGNOSIS_NO + '\'' +
                ", ICD_10='" + ICD_10 + '\'' +
                ", ICD_10_TEXT='" + ICD_10_TEXT + '\'' +
                ", CLINICAL_STAGE='" + CLINICAL_STAGE + '\'' +
                ", ICD_03='" + ICD_03 + '\'' +
                ", ICD_03_TEXT='" + ICD_03_TEXT + '\'' +
                ", DIFFERENTIAL_DEGREE='" + DIFFERENTIAL_DEGREE + '\'' +
                ", RECEPTION_ORG='" + RECEPTION_ORG + '\'' +
                ", RECEPTION_TIME=" + RECEPTION_TIME +
                ", CREATE_TIME=" + CREATE_TIME +
                ", WRITE_DOCTOR='" + WRITE_DOCTOR + '\'' +
                ", DIAGNOSECODE='" + DIAGNOSECODE + '\'' +
                ", DIAGNOSISBASIS='" + DIAGNOSISBASIS + '\'' +
                ", DIAGNOSISBASISOTHER='" + DIAGNOSISBASISOTHER + '\'' +
                ", DETAILED_DIAGNOSIS='" + DETAILED_DIAGNOSIS + '\'' +
                '}';
    }
}

