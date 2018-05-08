package com.springboot.ModelRef;

import com.springboot.ModelNew.CirrhosisNew;
import com.springboot.ModelOld.CirrhosisOld;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class CirrhosisRef {
    @Autowired
    private List<CirrhosisNew> listNew;
    @Autowired
    private CirrhosisNew cirrhosisN;
    public List<CirrhosisNew> REF(List<CirrhosisOld> listOld){
        for (int i = 0;i<listOld.size();i++){
            cirrhosisN.setVISIT_NO(listOld.get(i).getMzzy_id());
            cirrhosisN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());
            cirrhosisN.setSICK_NAME(listOld.get(i).getPatient_name());
            cirrhosisN.setSICK_SEX(listOld.get(i).getSex_id());
            cirrhosisN.setNATION(listOld.get(i).getNationality_id());
            cirrhosisN.setOCCUPATION(listOld.get(i).getOccupation_id());
            cirrhosisN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            cirrhosisN.setADDRESS(listOld.get(i).getAddress());
            cirrhosisN.setDIAGNOSECODE(listOld.get(i).getXzd());
            cirrhosisN.setICD_10_TEXT(listOld.get(i).getDisease_id());
            cirrhosisN.setVACCINATE(listOld.get(i).getXjws());
            cirrhosisN.setRECEPTION_ORG(listOld.get(i).getXym());
            cirrhosisN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
            cirrhosisN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            cirrhosisN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            listNew.add(cirrhosisN);
        }
        return listNew;
    }

}
