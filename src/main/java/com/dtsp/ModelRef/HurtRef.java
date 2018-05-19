package com.dtsp.ModelRef;

import com.dtsp.ModelNew.HurtNew;
import com.dtsp.ModelOld.HurtOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class HurtRef {

    public void replaceNullString(String str){
        if(str == null ) str = "";

    }
    public void replaceNullDate(Date date){
        if(date == null) date=new Date();
    }
    public List<HurtNew> REF(List<HurtOld> listOld) {
        List<HurtNew> listNew = new ArrayList<>();
        for (int i = 0; i < listOld.size(); i++) {
            HurtNew hurtN = new HurtNew();
            replaceNullString(listOld.get(i).getPatient_name());
            hurtN.setSICK_NAME(listOld.get(i).getPatient_name());
            replaceNullString(listOld.get(i).getSex_id());
            hurtN.setSICK_SEX(listOld.get(i).getSex_id());
            replaceNullString(listOld.get(i).getNationality_id());
            hurtN.setNATION(listOld.get(i).getNationality_id());
            replaceNullString(listOld.get(i).getHj());
            hurtN.setZONE_TYPE(listOld.get(i).getHj());
          if(listOld.get(i).getDate_of_birth()==null){
              listOld.get(i).setDate_of_birth(new Date());
          }
            hurtN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            replaceNullString(listOld.get(i).getOccupation_id());
            hurtN.setOCCUPATION(listOld.get(i).getOccupation_id());
            replaceNullString(listOld.get(i).getAddress());
            hurtN.setADDRESS(listOld.get(i).getAddress());
            replaceNullString(listOld.get(i).getXzd());
            hurtN.setHARM_REASON(listOld.get(i).getXzd());
            replaceNullString(listOld.get(i).getSfgy());
            hurtN.setDELIBERATELY(listOld.get(i).getSfgy());
            replaceNullString(listOld.get(i).getXshbw());
            hurtN.setHARM_PART(listOld.get(i).getXshbw());
            replaceNullString(listOld.get(i).getXshbw());
            hurtN.setPART_OTHER_TEXT(listOld.get(i).getXshbw());
            replaceNullString(listOld.get(i).getFsdd());
            hurtN.setTAKE_PLACE(listOld.get(i).getFsdd());
            replaceNullString(listOld.get(i).getYzcd());
            hurtN.setSEVERITY(listOld.get(i).getYzcd());
           if(listOld.get(i).getFs_date()==null){
               listOld.get(i).setFs_date(new Date());
           }
           hurtN.setOCCURRED_DATE(listOld.get(i).getFs_date());
            if(listOld.get(i).getDate_of_tb()==null){
                listOld.get(i).setDate_of_tb(new Date());
            }
             hurtN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            replaceNullString(listOld.get(i).getPerson_of_tb());
            hurtN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            listNew.add(hurtN);
        }
        return listNew;
    }

}
