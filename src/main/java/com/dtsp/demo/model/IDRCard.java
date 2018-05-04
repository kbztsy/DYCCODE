package com.dtsp.demo.model;

import java.util.Date;

public class IDRCard {

     private Integer caseClassificationCode;
     private String caseClassificationName;
     private String otherDiseaseName;
    private Date onsetDate;
    private String closeContactsSymptomCode;
    private String closeContactsSymptomName;
    private String customer;
    private String deletingReasonDetails;
    private String deletingTypeCode;
    private String deletingTypeName;

    public Integer getCaseClassificationCode() {
        return caseClassificationCode;
    }

    public void setCaseClassificationCode(Integer caseClassificationCode) {
        this.caseClassificationCode = caseClassificationCode;
    }

    public String getCaseClassificationName() {
        return caseClassificationName;
    }

    public void setCaseClassificationName(String caseClassificationName) {
        this.caseClassificationName = caseClassificationName;
    }

    public String getOtherDiseaseName() {
        return otherDiseaseName;
    }

    public void setOtherDiseaseName(String otherDiseaseName) {
        this.otherDiseaseName = otherDiseaseName;
    }

    public Date getOnsetDate() {
        return onsetDate;
    }

    public void setOnsetDate(Date onsetDate) {
        this.onsetDate = onsetDate;
    }

    public String getCloseContactsSymptomCode() {
        return closeContactsSymptomCode;
    }

    public void setCloseContactsSymptomCode(String closeContactsSymptomCode) {
        this.closeContactsSymptomCode = closeContactsSymptomCode;
    }

    public String getCloseContactsSymptomName() {
        return closeContactsSymptomName;
    }

    public void setCloseContactsSymptomName(String closeContactsSymptomName) {
        this.closeContactsSymptomName = closeContactsSymptomName;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDeletingReasonDetails() {
        return deletingReasonDetails;
    }

    public void setDeletingReasonDetails(String deletingReasonDetails) {
        this.deletingReasonDetails = deletingReasonDetails;
    }

    public String getDeletingTypeCode() {
        return deletingTypeCode;
    }

    public void setDeletingTypeCode(String deletingTypeCode) {
        this.deletingTypeCode = deletingTypeCode;
    }

    public String getDeletingTypeName() {
        return deletingTypeName;
    }

    public void setDeletingTypeName(String deletingTypeName) {
        this.deletingTypeName = deletingTypeName;
    }
}
