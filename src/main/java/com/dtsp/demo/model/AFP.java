package com.dtsp.demo.model;

import java.util.Date;

public class AFP {

      private String aFPCardID;
      private Integer patientResidenceTypeCode;
      private String patientResidenceTypeName;
      private Date palsyDate;
      private Date treatmentlandDate;
      private Integer treatmentlandTypeCode;
      private String treatmentlandTypeName;
      private Integer treatmentlandZoneCode;
      private String treatmentlandZoneName;
      private String tLAD;
      private String palsySymptom;

    public String getaFPCardID() {
        return aFPCardID;
    }

    public void setaFPCardID(String aFPCardID) {
        this.aFPCardID = aFPCardID;
    }

    public Integer getPatientResidenceTypeCode() {
        return patientResidenceTypeCode;
    }

    public void setPatientResidenceTypeCode(Integer patientResidenceTypeCode) {
        this.patientResidenceTypeCode = patientResidenceTypeCode;
    }

    public String getPatientResidenceTypeName() {
        return patientResidenceTypeName;
    }

    public void setPatientResidenceTypeName(String patientResidenceTypeName) {
        this.patientResidenceTypeName = patientResidenceTypeName;
    }

    public Date getPalsyDate() {
        return palsyDate;
    }

    public void setPalsyDate(Date palsyDate) {
        this.palsyDate = palsyDate;
    }

    public Date getTreatmentlandDate() {
        return treatmentlandDate;
    }

    public void setTreatmentlandDate(Date treatmentlandDate) {
        this.treatmentlandDate = treatmentlandDate;
    }

    public Integer getTreatmentlandTypeCode() {
        return treatmentlandTypeCode;
    }

    public void setTreatmentlandTypeCode(Integer treatmentlandTypeCode) {
        this.treatmentlandTypeCode = treatmentlandTypeCode;
    }

    public String getTreatmentlandTypeName() {
        return treatmentlandTypeName;
    }

    public void setTreatmentlandTypeName(String treatmentlandTypeName) {
        this.treatmentlandTypeName = treatmentlandTypeName;
    }

    public Integer getTreatmentlandZoneCode() {
        return treatmentlandZoneCode;
    }

    public void setTreatmentlandZoneCode(Integer treatmentlandZoneCode) {
        this.treatmentlandZoneCode = treatmentlandZoneCode;
    }

    public String getTreatmentlandZoneName() {
        return treatmentlandZoneName;
    }

    public void setTreatmentlandZoneName(String treatmentlandZoneName) {
        this.treatmentlandZoneName = treatmentlandZoneName;
    }

    public String gettLAD() {
        return tLAD;
    }

    public void settLAD(String tLAD) {
        this.tLAD = tLAD;
    }

    public String getPalsySymptom() {
        return palsySymptom;
    }

    public void setPalsySymptom(String palsySymptom) {
        this.palsySymptom = palsySymptom;
    }
}
