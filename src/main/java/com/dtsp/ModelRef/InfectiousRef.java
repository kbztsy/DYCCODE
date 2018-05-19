package com.dtsp.ModelRef;

import com.dtsp.ModelNew.InfectiousNew;
import com.dtsp.ModelOld.InfectiousOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class InfectiousRef {



    public void replaceNullString(String str){
        if(str == null ) str = "";

    }
    public List<InfectiousNew> REF(List<InfectiousOld> listOld){
        List<InfectiousNew> listNew = new ArrayList<>();
        for (int i = 0;i<listOld.size();i++){
            InfectiousNew infectiousN = new InfectiousNew();
            replaceNullString(listOld.get(i).getMzzy_id());
            infectiousN.setVISIT_NO(listOld.get(i).getMzzy_id());
            replaceNullString(listOld.get(i).getMzzy_id());
            infectiousN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());
            replaceNullString(listOld.get(i).getPatient_name());
            infectiousN.setSICK_NAME(listOld.get(i).getPatient_name());
            replaceNullString(listOld.get(i).getHejz_name());
            infectiousN.setSICK_PARENT_NAME(listOld.get(i).getHejz_name());
            replaceNullString(listOld.get(i).getIdcard_no());
            infectiousN.setIDENTITY_CARD_NO(listOld.get(i).getIdcard_no());
            replaceNullString(listOld.get(i).getSex_id());
            infectiousN.setSICK_SEX(listOld.get(i).getSex_id());
          if(listOld.get(i).getDate_of_birth()==null){
              listOld.get(i).setDate_of_birth(new Date());
          }
            infectiousN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            replaceNullString(listOld.get(i).getTelephone());
            infectiousN.setSICK_PHONE(listOld.get(i).getTelephone());
            replaceNullString(listOld.get(i).getGzdw());
            infectiousN.setWORK_PLACE(listOld.get(i).getGzdw());
            replaceNullString(listOld.get(i).getBrsy());
            infectiousN.setSICK_BELONG(listOld.get(i).getBrsy());
            replaceNullString(listOld.get(i).getAddress());
            infectiousN.setADDRESS(listOld.get(i).getAddress());
            replaceNullString(listOld.get(i).getOccupation_id());
            infectiousN.setOCCUPATION(listOld.get(i).getOccupation_id());
            replaceNullString(listOld.get(i).getXblfl1());
            infectiousN.setDIAGNOSIS_TYPE_CODE(listOld.get(i).getXblfl1());
            replaceNullString(listOld.get(i).getXblfl2());
            infectiousN.setCASETYPE(listOld.get(i).getXblfl2());
           if(listOld.get(i).getFb_date()==null){
               listOld.get(i).setFb_date(new Date());
           }
            infectiousN.setACCIDENT_DATE(listOld.get(i).getFb_date());
       if(listOld.get(i).getDate_of_zd()==null){
           listOld.get(i).setDate_of_zd(new Date());
       }
            infectiousN.setDIAGNOSE_DATE(listOld.get(i).getDate_of_zd());
          if(listOld.get(i).getDare_date()==null){
              listOld.get(i).setDare_date(new Date());
          }

            infectiousN.setDEATH_DATE(listOld.get(i).getDare_date());
            replaceNullString(listOld.get(i).getPerson_of_tb());
            infectiousN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            if(listOld.get(i).getDate_of_tb()==null){
                listOld.get(i).setDate_of_tb(new Date());
            }
            infectiousN.setCREATE_TIME(listOld.get(i).getDate_of_tb()) ;
            listNew.add(infectiousN);
        }
        return listNew;
    }
}
