package com.dtsp.ModelRef;

import com.dtsp.ModelNew.CirrhosisNew;
import com.dtsp.ModelOld.CirrhosisOld;
import com.dtsp.util.RandNumber;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class CirrhosisRef {
    @Autowired
    private List<CirrhosisNew> listNew;
    @Autowired
    private CirrhosisNew cirrhosisN;
    public void replaceNullString(String str){
        if(str == null ) str = "";

    }
    public void replaceNullDate(Date date){
        if(date == null) date=new Date();
    }
    public List<CirrhosisNew> REF(List<CirrhosisOld> listOld){
        for (int i = 0;i<listOld.size();i++){
            cirrhosisN=null;
            replaceNullString(listOld.get(i).getMzzy_id());
            cirrhosisN.setVISIT_NO(listOld.get(i).getMzzy_id());
            replaceNullString(listOld.get(i).getMzzy_id());
            cirrhosisN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());
            replaceNullString(listOld.get(i).getPatient_name());
            cirrhosisN.setSICK_NAME(listOld.get(i).getPatient_name());
            replaceNullString(listOld.get(i).getSex_id());
            cirrhosisN.setSICK_SEX(listOld.get(i).getSex_id());
            replaceNullString(listOld.get(i).getNationality_id());
            cirrhosisN.setNATION(listOld.get(i).getNationality_id());
            replaceNullString(listOld.get(i).getOccupation_id());
            cirrhosisN.setOCCUPATION(listOld.get(i).getOccupation_id());
            replaceNullDate(listOld.get(i).getDate_of_birth());
            cirrhosisN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            replaceNullString(listOld.get(i).getAddress());
            cirrhosisN.setADDRESS(listOld.get(i).getAddress());
            replaceNullString(listOld.get(i).getXzd());
            cirrhosisN.setDIAGNOSECODE(listOld.get(i).getXzd());
            replaceNullString(listOld.get(i).getDisease_id());
            cirrhosisN.setICD_10_TEXT(listOld.get(i).getDisease_id());
            replaceNullString(listOld.get(i).getXjws());
            cirrhosisN.setVACCINATE(listOld.get(i).getXjws());
            replaceNullString(listOld.get(i).getXym());
            cirrhosisN.setRECEPTION_ORG(listOld.get(i).getXym());
            replaceNullDate(listOld.get(i).getDate_of_zd());
            cirrhosisN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
            replaceNullDate(listOld.get(i).getDate_of_tb());
            cirrhosisN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            replaceNullString(listOld.get(i).getPerson_of_tb());
            cirrhosisN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            System.out.println("++++=="+listNew.size());
            listNew.add(cirrhosisN);
        }
        return listNew;
    }

}
