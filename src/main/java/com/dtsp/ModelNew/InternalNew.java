package com.dtsp.ModelNew;
import com.dtsp.util.RandNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class InternalNew {
    @Autowired
    private RandNumber randNumber;
    private String ID;
    private BigDecimal FID;
    private String VISIT_NO;// 门诊住院号
    private String RESI_CASE_NO;
    private String	SICK_NAME ;//患者姓名
    private String	SICK_SEX ;// 性别
    private Date	BIRTHDAY ;//出生日期

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

    public Date getBIRTHDAY() {
        return BIRTHDAY;
    }

    public void setBIRTHDAY(Date BIRTHDAY) {
        this.BIRTHDAY = BIRTHDAY;
    }

    @Override
    public String toString() {
        return "InternalNew{" +
                "VISIT_NO='" + VISIT_NO + '\'' +
                ", RESI_CASE_NO='" + RESI_CASE_NO + '\'' +
                ", SICK_NAME='" + SICK_NAME + '\'' +
                ", SICK_SEX='" + SICK_SEX + '\'' +
                ", BIRTHDAY=" + BIRTHDAY +
                '}';
    }
}
