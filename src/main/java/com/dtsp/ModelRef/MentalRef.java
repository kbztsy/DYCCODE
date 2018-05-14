package com.dtsp.ModelRef;

import com.dtsp.ModelNew.MentalNew;
import com.dtsp.ModelOld.MentalOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MentalRef {

    @Autowired
    private List<MentalNew> listNew;
    @Autowired
    private MentalNew mentalN;
    public List<MentalNew> REF(List<MentalOld> listOld){
        for (int i = 0;i<listOld.size();i++){
            mentalN.setVISIT_NO(listOld.get(i).getMzzy_id().trim());
            mentalN.setRESI_CASE_NO(listOld.get(i).getMzzy_id().trim());
            mentalN.setSICK_NAME(listOld.get(i).getPatient_name().trim());
            mentalN.setSICK_SEX(listOld.get(i).getSex_id().trim());
            mentalN.setNATION(listOld.get(i).getNationality_id().trim());
            mentalN.setOCCUPATION(listOld.get(i).getOccupation_id().trim());
            mentalN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            mentalN.setADDRESS(listOld.get(i).getAddress().trim());
            mentalN.setWORK_PLACE(listOld.get(i).getGzdw().trim());
            mentalN.setFAMILY_HISTORY(listOld.get(i).getXxgys().trim());
            mentalN.setDISPOSITION(listOld.get(i).getXzd().trim());
            mentalN.setPSYCHO(listOld.get(i).getXxgys().trim());
            mentalN.setDIAGNOSECODE(listOld.get(i).getXzd().trim());
            mentalN.setACCIDENT_DATE(listOld.get(i).getFb_date());
            mentalN.setCCMD3_CODE(listOld.get(i).getCcmd_id().trim());
            mentalN.setRECEPTION_ORG(listOld.get(i).getZddw().trim());
            mentalN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
            mentalN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            mentalN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb().trim());
            listNew.add(mentalN);
        }
        return listNew;
    }
}
