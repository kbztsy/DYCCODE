package com.dtsp.ModelOld;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CirrhosisOld {//肝硬化
    private String mzzy_id;
    private String patient_name;
    private String sex_id;
    private String nationality_id;
    private String occupation_id;
    private Date date_of_birth;
    private String address;
    private String xzd;
    private String disease_id;
    private String xjws;
    private String xym;
    private String zddw;
    private Date date_of_zd;
    private String tbdw;
    private Date date_of_tb;
    private String person_of_tb;

    public String getMzzy_id() {
        return mzzy_id;
    }

    public void setMzzy_id(String mzzy_id) {
        this.mzzy_id = mzzy_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getSex_id() {
        return sex_id;
    }

    public void setSex_id(String sex_id) {
        this.sex_id = sex_id;
    }

    public String getNationality_id() {
        return nationality_id;
    }

    public void setNationality_id(String nationality_id) {
        this.nationality_id = nationality_id;
    }

    public String getOccupation_id() {
        return occupation_id;
    }

    public void setOccupation_id(String occupation_id) {
        this.occupation_id = occupation_id;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getXzd() {
        return xzd;
    }

    public void setXzd(String xzd) {
        this.xzd = xzd;
    }

    public String getDisease_id() {
        return disease_id;
    }

    public void setDisease_id(String disease_id) {
        this.disease_id = disease_id;
    }

    public String getXjws() {
        return xjws;
    }

    public void setXjws(String xjws) {
        this.xjws = xjws;
    }

    public String getXym() {
        return xym;
    }

    public void setXym(String xym) {
        this.xym = xym;
    }

    public String getZddw() {
        return zddw;
    }

    public void setZddw(String zddw) {
        this.zddw = zddw;
    }

    public Date getDate_of_zd() {
        return date_of_zd;
    }

    public void setDate_of_zd(Date date_of_zd) {
        this.date_of_zd = date_of_zd;
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

    public String getPerson_of_tb() {
        return person_of_tb;
    }

    public void setPerson_of_tb(String person_of_tb) {
        this.person_of_tb = person_of_tb;
    }

    public CirrhosisOld(String mzzy_id, String patient_name, String sex_id, String nationality_id, String occupation_id, Date date_of_birth, String address, String xzd,
                        String disease_id, String xjws, String xym, String zddw, Date date_of_zd, String tbdw, Date date_of_tb, String person_of_tb) {
        this.mzzy_id = mzzy_id;
        this.patient_name = patient_name;
        this.sex_id = sex_id;
        this.nationality_id = nationality_id;
        this.occupation_id = occupation_id;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.xzd = xzd;
        this.disease_id = disease_id;
        this.xjws = xjws;
        this.xym = xym;
        this.zddw = zddw;
        this.date_of_zd = date_of_zd;
        this.tbdw = tbdw;
        this.date_of_tb = date_of_tb;
        this.person_of_tb = person_of_tb;
    }

    public CirrhosisOld() {
    }
}
