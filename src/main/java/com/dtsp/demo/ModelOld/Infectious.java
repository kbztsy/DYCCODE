package com.dtsp.demo.ModelNew;

import java.util.Date;

public class Infectious {


    private String 	mzzy_id;// 门诊住院号
     private String 	patient_name;// 患者姓名
 private String 	hejz_name;//患儿家长姓名
     private String 	idcard_no;//身份证号
   private String  sex_id;// 性别
     private Date date_of_birth;//出生日期
     private String 	telephone;//联系电话
    private String 	gzdw;// 工作单位
     private String 	brsy;//病人属于
     private String 	address;//现住址（详填）
     private String 	occupation_id;//患者职业
     private String 	xblfl1;//疾病分类（1）
     private String 	xblfl2;//疾病分类（2）
    private Date	fb_date;//发病日期
  private Date 	date_of_zd;//   诊断日期
    private Date 	dare_date;//死亡日期
   private String 	xzd;//  甲类传染病
     private String 	xzd2;//乙类传染病
   private String 	 xzd3;// 丙类传染病
     private String 	dzbm;//订正病名
     private String  	yzd;//原诊断
     private String 	tbdw;//填报医院
     private String 	dept_id;//填报科室
     private String 	person_of_tb;//填报医生
     private Date  	date_of_tb;//医生填卡日期
     private Date 	bysk_date;//本院收卡日期
     private String 	bz;//备注

    public String getHejz_name() {
        return hejz_name;
    }

    public void setHejz_name(String hejz_name) {
        this.hejz_name = hejz_name;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGzdw() {
        return gzdw;
    }

    public void setGzdw(String gzdw) {
        this.gzdw = gzdw;
    }

    public String getBrsy() {
        return brsy;
    }

    public void setBrsy(String brsy) {
        this.brsy = brsy;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation_id() {
        return occupation_id;
    }

    public void setOccupation_id(String occupation_id) {
        this.occupation_id = occupation_id;
    }

    public String getXblfl1() {
        return xblfl1;
    }

    public void setXblfl1(String xblfl1) {
        this.xblfl1 = xblfl1;
    }

    public String getXblfl2() {
        return xblfl2;
    }

    public void setXblfl2(String xblfl2) {
        this.xblfl2 = xblfl2;
    }

    public Date getFb_date() {
        return fb_date;
    }

    public void setFb_date(Date fb_date) {
        this.fb_date = fb_date;
    }

    public Date getDate_of_zd() {
        return date_of_zd;
    }

    public void setDate_of_zd(Date date_of_zd) {
        this.date_of_zd = date_of_zd;
    }

    public Date getDare_date() {
        return dare_date;
    }

    public void setDare_date(Date dare_date) {
        this.dare_date = dare_date;
    }

    public String getXzd() {
        return xzd;
    }

    public void setXzd(String xzd) {
        this.xzd = xzd;
    }

    public String getXzd2() {
        return xzd2;
    }

    public void setXzd2(String xzd2) {
        this.xzd2 = xzd2;
    }

    public String getXzd3() {
        return xzd3;
    }

    public void setXzd3(String xzd3) {
        this.xzd3 = xzd3;
    }

    public String getDzbm() {
        return dzbm;
    }

    public void setDzbm(String dzbm) {
        this.dzbm = dzbm;
    }

    public String getYzd() {
        return yzd;
    }

    public void setYzd(String yzd) {
        this.yzd = yzd;
    }

    public String getTbdw() {
        return tbdw;
    }

    public void setTbdw(String tbdw) {
        this.tbdw = tbdw;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public String getPerson_of_tb() {
        return person_of_tb;
    }

    public void setPerson_of_tb(String person_of_tb) {
        this.person_of_tb = person_of_tb;
    }

    public Date getDate_of_tb() {
        return date_of_tb;
    }

    public void setDate_of_tb(Date date_of_tb) {
        this.date_of_tb = date_of_tb;
    }

    public Date getBysk_date() {
        return bysk_date;
    }

    public void setBysk_date(Date bysk_date) {
        this.bysk_date = bysk_date;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

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

    public String getIdcard_no() {
        return idcard_no;
    }

    public void setIdcard_no(String idcard_no) {
        this.idcard_no = idcard_no;
    }

    public Infectious(String mzzy_id, String patient_name, String hejz_name, String idcard_no, String sex_id, Date date_of_birth, String telephone, String gzdw, String brsy, String address, String occupation_id, String xblfl1, String xblfl2, Date fb_date, Date date_of_zd, Date dare_date, String xzd, String xzd2, String xzd3, String dzbm, String yzd, String tbdw,
                      String dept_id, String person_of_tb, Date date_of_tb, Date bysk_date, String bz) {
        this.mzzy_id = mzzy_id;
        this.patient_name = patient_name;
        this.hejz_name = hejz_name;
        this.idcard_no = idcard_no;
        this.sex_id = sex_id;
        this.date_of_birth = date_of_birth;
        this.telephone = telephone;
        this.gzdw = gzdw;
        this.brsy = brsy;
        this.address = address;
        this.occupation_id = occupation_id;
        this.xblfl1 = xblfl1;
        this.xblfl2 = xblfl2;
        this.fb_date = fb_date;
        this.date_of_zd = date_of_zd;
        this.dare_date = dare_date;
        this.xzd = xzd;
        this.xzd2 = xzd2;
        this.xzd3 = xzd3;
        this.dzbm = dzbm;
        this.yzd = yzd;
        this.tbdw = tbdw;
        this.dept_id = dept_id;
        this.person_of_tb = person_of_tb;
        this.date_of_tb = date_of_tb;
        this.bysk_date = bysk_date;
        this.bz = bz;
    }

    public Infectious() {
    }
}
