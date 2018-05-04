package com.dtsp.demo.model;

public class HFMD {
    
     private String hFMDCardID;
     private Integer intensivePatientCode;
     private String intensivePatientName;
     private Integer laborTestResultCode;
     private String laborTestResultName;

    public String gethFMDCardID() {
        return hFMDCardID;
    }

    public void sethFMDCardID(String hFMDCardID) {
        this.hFMDCardID = hFMDCardID;
    }

    public Integer getIntensivePatientCode() {
        return intensivePatientCode;
    }

    public void setIntensivePatientCode(Integer intensivePatientCode) {
        this.intensivePatientCode = intensivePatientCode;
    }

    public String getIntensivePatientName() {
        return intensivePatientName;
    }

    public void setIntensivePatientName(String intensivePatientName) {
        this.intensivePatientName = intensivePatientName;
    }

    public Integer getLaborTestResultCode() {
        return laborTestResultCode;
    }

    public void setLaborTestResultCode(Integer laborTestResultCode) {
        this.laborTestResultCode = laborTestResultCode;
    }

    public String getLaborTestResultName() {
        return laborTestResultName;
    }

    public void setLaborTestResultName(String laborTestResultName) {
        this.laborTestResultName = laborTestResultName;
    }
}
