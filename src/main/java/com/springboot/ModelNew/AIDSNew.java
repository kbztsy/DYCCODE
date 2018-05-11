package com.springboot.ModelNew;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AIDSNew {
    private String ID;
    private Long FID;
    private String MARRIAGE;
    private String EDUCATIONLEVEL_CODE;
    private String POSSIBLE_INFECTION_ROUTE_CODE;
    private String VENEREAL_HISTORY_CODE;
    private String CHLAMYDIAL_TRACHOMATIS_CODE;
    private String AIDS_CARD_ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Long getFID() {
        return FID;
    }

    public void setFID(Long FID) {
        this.FID = FID;
    }

    public String getMARRIAGE() {
        return MARRIAGE;
    }

    public void setMARRIAGE(String MARRIAGE) {
        this.MARRIAGE = MARRIAGE;
    }

    public String getEDUCATIONLEVEL_CODE() {
        return EDUCATIONLEVEL_CODE;
    }

    public void setEDUCATIONLEVEL_CODE(String EDUCATIONLEVEL_CODE) {
        this.EDUCATIONLEVEL_CODE = EDUCATIONLEVEL_CODE;
    }

    public String getPOSSIBLE_INFECTION_ROUTE_CODE() {
        return POSSIBLE_INFECTION_ROUTE_CODE;
    }

    public void setPOSSIBLE_INFECTION_ROUTE_CODE(String POSSIBLE_INFECTION_ROUTE_CODE) {
        this.POSSIBLE_INFECTION_ROUTE_CODE = POSSIBLE_INFECTION_ROUTE_CODE;
    }

    public String getVENEREAL_HISTORY_CODE() {
        return VENEREAL_HISTORY_CODE;
    }

    public void setVENEREAL_HISTORY_CODE(String VENEREAL_HISTORY_CODE) {
        this.VENEREAL_HISTORY_CODE = VENEREAL_HISTORY_CODE;
    }

    public String getCHLAMYDIAL_TRACHOMATIS_CODE() {
        return CHLAMYDIAL_TRACHOMATIS_CODE;
    }

    public void setCHLAMYDIAL_TRACHOMATIS_CODE(String CHLAMYDIAL_TRACHOMATIS_CODE) {
        this.CHLAMYDIAL_TRACHOMATIS_CODE = CHLAMYDIAL_TRACHOMATIS_CODE;
    }

    public String getAIDS_CARD_ID() {
        return AIDS_CARD_ID;
    }

    public void setAIDS_CARD_ID(String AIDS_CARD_ID) {
        this.AIDS_CARD_ID = AIDS_CARD_ID;
    }

    @Override
    public String toString() {
        return "AIDSNew{" +
                "MARRIAGE='" + MARRIAGE + '\'' +
                ", EDUCATIONLEVEL_CODE='" + EDUCATIONLEVEL_CODE + '\'' +
                ", POSSIBLE_INFECTION_ROUTE_CODE='" + POSSIBLE_INFECTION_ROUTE_CODE + '\'' +
                ", VENEREAL_HISTORY_CODE='" + VENEREAL_HISTORY_CODE + '\'' +
                ", CHLAMYDIAL_TRACHOMATIS_CODE='" + CHLAMYDIAL_TRACHOMATIS_CODE + '\'' +
                ", AIDS_CARD_ID='" + AIDS_CARD_ID + '\'' +
                '}';
    }
}
