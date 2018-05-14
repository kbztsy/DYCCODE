package com.dtsp.ModelRef;

import com.dtsp.ModelNew.CirrhosisNew;
import com.dtsp.ModelOld.CirrhosisOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CirrhosisRef {
    @Autowired
    private List<CirrhosisNew> listNew;
    @Autowired
    private CirrhosisNew cirrhosisN;
    public List<CirrhosisNew> REF(List<CirrhosisOld> listOld){
        for (int i = 0;i<listOld.size();i++){
            cirrhosisN.setVISIT_NO(listOld.get(i).getMzzy_id().trim());
            cirrhosisN.setRESI_CASE_NO(listOld.get(i).getMzzy_id().trim());
            cirrhosisN.setSICK_NAME(listOld.get(i).getPatient_name().trim());
            cirrhosisN.setSICK_SEX(listOld.get(i).getSex_id().trim());
            cirrhosisN.setNATION(listOld.get(i).getNationality_id().trim());
            cirrhosisN.setOCCUPATION(listOld.get(i).getOccupation_id().trim());
            cirrhosisN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            cirrhosisN.setADDRESS(listOld.get(i).getAddress().trim());
            cirrhosisN.setDIAGNOSECODE(listOld.get(i).getXzd().trim());
            cirrhosisN.setICD_10_TEXT(listOld.get(i).getDisease_id().trim());
            cirrhosisN.setVACCINATE(listOld.get(i).getXjws().trim());
            cirrhosisN.setRECEPTION_ORG(listOld.get(i).getXym().trim());
            cirrhosisN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
            cirrhosisN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            cirrhosisN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb().trim());
            listNew.add(cirrhosisN);
        }
        return listNew;
    }

}
