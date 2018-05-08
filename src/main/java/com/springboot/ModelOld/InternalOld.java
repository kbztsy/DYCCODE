package com.springboot.ModelOld;

import java.util.Date;

public class InternalOld {
    private String mzzy_id;// 门诊住院号
    private String	dept_id;//科室
    private String	patient_name ;//患者姓名
    private String	sex_id ;// 性别
    private Date	date_of_birth ;//出生日期
    private String	zd ;//临床诊断
    private String	xshbw;//  感染部位
    private String	yygrzz;//院内感染症状
    private Date yngr_date;//院内感染时间
    private Date	sj_date;//送检日期
    private String	bb_name;//标本名称
    private String	 xjz;//细菌种类
    private String	ymjg;//药敏结果
    private String	xwxys;// 危险因素
    private String	 syhkss;//使用何抗生素

    public String getMzzy_id() {
        return mzzy_id;
    }

    public void setMzzy_id(String mzzy_id) {
        this.mzzy_id = mzzy_id;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
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

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getZd() {
        return zd;
    }

    public void setZd(String zd) {
        this.zd = zd;
    }

    public String getXshbw() {
        return xshbw;
    }

    public void setXshbw(String xshbw) {
        this.xshbw = xshbw;
    }

    public String getYygrzz() {
        return yygrzz;
    }

    public void setYygrzz(String yygrzz) {
        this.yygrzz = yygrzz;
    }

    public Date getYngr_date() {
        return yngr_date;
    }

    public void setYngr_date(Date yngr_date) {
        this.yngr_date = yngr_date;
    }

    public Date getSj_date() {
        return sj_date;
    }

    public void setSj_date(Date sj_date) {
        this.sj_date = sj_date;
    }

    public String getBb_name() {
        return bb_name;
    }

    public void setBb_name(String bb_name) {
        this.bb_name = bb_name;
    }

    public String getXjz() {
        return xjz;
    }

    public void setXjz(String xjz) {
        this.xjz = xjz;
    }

    public String getYmjg() {
        return ymjg;
    }

    public void setYmjg(String ymjg) {
        this.ymjg = ymjg;
    }

    public String getXwxys() {
        return xwxys;
    }

    public void setXwxys(String xwxys) {
        this.xwxys = xwxys;
    }

    public String getSyhkss() {
        return syhkss;
    }

    public void setSyhkss(String syhkss) {
        this.syhkss = syhkss;
    }

    @Override
    public String toString() {
        return "InternalOld{" +
                "mzzy_id='" + mzzy_id + '\'' +
                ", dept_id='" + dept_id + '\'' +
                ", patient_name='" + patient_name + '\'' +
                ", sex_id='" + sex_id + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", zd='" + zd + '\'' +
                ", xshbw='" + xshbw + '\'' +
                ", yygrzz='" + yygrzz + '\'' +
                ", yngr_date=" + yngr_date +
                ", sj_date=" + sj_date +
                ", bb_name='" + bb_name + '\'' +
                ", xjz='" + xjz + '\'' +
                ", ymjg='" + ymjg + '\'' +
                ", xwxys='" + xwxys + '\'' +
                ", syhkss='" + syhkss + '\'' +
                '}';
    }
}
