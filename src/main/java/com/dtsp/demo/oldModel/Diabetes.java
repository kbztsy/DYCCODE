package com.dtsp.demo.model;

public class Diabetes {

    private String  mzzy_id;//   门诊住院号
    private String	patient_name;//  患者姓名
    private String	sex_id;//    性别
    private String	nationality_id;//    民族
    private String	occupation_id;//    职业
    private String	date_of_birth;// 出生日期
    private String	address;//  现住址
    private String	xzd1;//    诊断
    private String 	xhbz1;//    合并症
    private String disease_id;// ICD--10
    private String	zddw;//    诊断单位
    private String	date_of_zd;//诊断日期
    private String	tbdw;//    填报单位
    private String	date_of_tb;//  填报日期
    private String	 person_of_tb;//  填报人

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

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getXzd1() {
        return xzd1;
    }

    public void setXzd1(String xzd1) {
        this.xzd1 = xzd1;
    }

    public String getXhbz1() {
        return xhbz1;
    }

    public void setXhbz1(String xhbz1) {
        this.xhbz1 = xhbz1;
    }

    public String getDisease_id() {
        return disease_id;
    }

    public void setDisease_id(String disease_id) {
        this.disease_id = disease_id;
    }

    public String getZddw() {
        return zddw;
    }

    public void setZddw(String zddw) {
        this.zddw = zddw;
    }

    public String getDate_of_zd() {
        return date_of_zd;
    }

    public void setDate_of_zd(String date_of_zd) {
        this.date_of_zd = date_of_zd;
    }

    public String getTbdw() {
        return tbdw;
    }

    public void setTbdw(String tbdw) {
        this.tbdw = tbdw;
    }

    public String getDate_of_tb() {
        return date_of_tb;
    }

    public void setDate_of_tb(String date_of_tb) {
        this.date_of_tb = date_of_tb;
    }

    public String getPerson_of_tb() {
        return person_of_tb;
    }

    public void setPerson_of_tb(String person_of_tb) {
        this.person_of_tb = person_of_tb;
    }

    public Diabetes(String mzzy_id, String patient_name, String sex_id, String nationality_id, String occupation_id, String date_of_birth, String address, String xzd1, String xhbz1, String disease_id, String zddw,
                    String date_of_zd, String tbdw, String date_of_tb, String person_of_tb) {
        this.mzzy_id = mzzy_id;
        this.patient_name = patient_name;
        this.sex_id = sex_id;
        this.nationality_id = nationality_id;
        this.occupation_id = occupation_id;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.xzd1 = xzd1;
        this.xhbz1 = xhbz1;
        this.disease_id = disease_id;
        this.zddw = zddw;
        this.date_of_zd = date_of_zd;
        this.tbdw = tbdw;
        this.date_of_tb = date_of_tb;
        this.person_of_tb = person_of_tb;
    }

    public Diabetes() {
    }
}
