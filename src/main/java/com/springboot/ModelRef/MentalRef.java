package com.springboot.ModelRef;

import com.springboot.ModelNew.MentalNew;
import com.springboot.ModelOld.MentalOld;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class MentalRef {

    @Autowired
    private List<MentalNew> listNew;
    @Autowired
    private MentalNew mentalN;
    public List<MentalNew> REF(List<MentalOld> listOld){
        for (int i = 0;i<listOld.size();i++){
            mentalN.setVISIT_NO(listOld.get(i).getMzzy_id());
            mentalN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());
            mentalN.setSICK_NAME(listOld.get(i).getPatient_name());
            mentalN.setSICK_SEX(listOld.get(i).getSex_id());
            mentalN.setNATION(listOld.get(i).getNationality_id());
            mentalN.setOCCUPATION(listOld.get(i).getOccupation_id());
            mentalN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            mentalN.setADDRESS(listOld.get(i).getAddress());
            mentalN.setWORK_PLACE(listOld.get(i).getGzdw());
            mentalN.setFAMILY_HISTORY(listOld.get(i).getXxgys());
            mentalN.setDISPOSITION(listOld.get(i).getXzd());
            mentalN.setPSYCHO(listOld.get(i).getXxgys());
            mentalN.setDIAGNOSECODE(listOld.get(i).getXzd());
            mentalN.setACCIDENT_DATE(listOld.get(i).getFb_date());
            mentalN.setCCMD3_CODE(listOld.get(i).getCcmd_id());
            mentalN.setRECEPTION_ORG(listOld.get(i).getZddw());
            mentalN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
            mentalN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            mentalN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            listNew.add(mentalN);
        }
        return listNew;
    }
}
