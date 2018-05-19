package com.dtsp.ModelRef;

import com.dtsp.ModelNew.MentalNew;
import com.dtsp.ModelOld.MentalOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class MentalRef {

    public void replaceNullString(String str){
        if(str == null ) str = "";

    }
    public List<MentalNew> REF(List<MentalOld> listOld){
        List<MentalNew> listNew = new ArrayList<>();
        for (int i = 0;i<listOld.size();i++){
            MentalNew mentalN = new  MentalNew();
            replaceNullString(listOld.get(i).getMzzy_id());
            mentalN.setVISIT_NO(listOld.get(i).getMzzy_id());
            replaceNullString(listOld.get(i).getMzzy_id());
            mentalN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());
            replaceNullString(listOld.get(i).getPatient_name());
            mentalN.setSICK_NAME(listOld.get(i).getPatient_name());
            replaceNullString(listOld.get(i).getSex_id());
            mentalN.setSICK_SEX(listOld.get(i).getSex_id());
            replaceNullString(listOld.get(i).getNationality_id());
            mentalN.setNATION(listOld.get(i).getNationality_id());
            replaceNullString(listOld.get(i).getOccupation_id());
            mentalN.setOCCUPATION(listOld.get(i).getOccupation_id());
           if(listOld.get(i).getDate_of_birth()==null){
               listOld.get(i).setDate_of_birth(new Date());
           }
            mentalN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            replaceNullString(listOld.get(i).getAddress());
            mentalN.setADDRESS(listOld.get(i).getAddress());
            replaceNullString(listOld.get(i).getGzdw());
            mentalN.setWORK_PLACE(listOld.get(i).getGzdw());
            replaceNullString(listOld.get(i).getXxgys());
            mentalN.setFAMILY_HISTORY(listOld.get(i).getXxgys());
            replaceNullString(listOld.get(i).getXzd());
            mentalN.setDISPOSITION(listOld.get(i).getXzd());
            replaceNullString(listOld.get(i).getXxgys());
            mentalN.setPSYCHO(listOld.get(i).getXxgys());
            replaceNullString(listOld.get(i).getXzd());
            mentalN.setDIAGNOSECODE(listOld.get(i).getXzd());
           if(listOld.get(i).getFb_date()==null){
               listOld.get(i).setFb_date(new Date());
           }
            mentalN.setACCIDENT_DATE(listOld.get(i).getFb_date());
            replaceNullString(listOld.get(i).getCcmd_id());
            mentalN.setCCMD3_CODE(listOld.get(i).getCcmd_id());
            replaceNullString(listOld.get(i).getZddw());
            mentalN.setRECEPTION_ORG(listOld.get(i).getZddw());
           if(listOld.get(i).getDate_of_zd()==null){
               listOld.get(i).setDate_of_zd(new Date());
           }
            mentalN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
              if(listOld.get(i).getDate_of_tb()==null){
                  listOld.get(i).setDate_of_tb(new Date());
               }
            mentalN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            replaceNullString(listOld.get(i).getPerson_of_tb());
            mentalN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            listNew.add(mentalN);
        }
        return listNew;
    }
}
