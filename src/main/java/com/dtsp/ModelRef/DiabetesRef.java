package com.dtsp.ModelRef;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class DiabetesRef {

    public void replaceNullString(String str){
        if(str == null ) str = "";

    }
    public void replaceNullDate(Date date){
        if(date == null) date=new Date();
    }
    public List<DiabetesNew> REF(List<DiabetesOld> listOld){
        List<DiabetesNew> listNew = new ArrayList<DiabetesNew>();
        for (int i = 0;i<listOld.size();i++){
            DiabetesNew diabetesN = new  DiabetesNew();
            replaceNullString(listOld.get(i).getMzzy_id());
            diabetesN.setVISIT_NO(listOld.get(i).getMzzy_id()) ;
            replaceNullString(listOld.get(i).getMzzy_id());
            diabetesN.setRESI_CASE_NO(listOld.get(i).getMzzy_id() );
            replaceNullString(listOld.get(i).getPatient_name());
            diabetesN.setSICK_NAME(listOld.get(i).getPatient_name()) ;
            replaceNullString(listOld.get(i).getSex_id());
            diabetesN.setSICK_SEX(listOld.get(i).getSex_id());
            replaceNullString(listOld.get(i).getNationality_id());
            diabetesN.setNATION(listOld.get(i).getNationality_id()) ;
            replaceNullString(listOld.get(i).getOccupation_id());
            diabetesN.setOCCUPATION(listOld.get(i).getOccupation_id());
          //  replaceNullDate( listOld.get(i).getDate_of_birth());
            if(listOld.get(i).getDate_of_birth()==null){
                listOld.get(i).setDate_of_birth(new Date());
            }
            diabetesN.setBIRTHDAY(listOld.get(i).getDate_of_birth()) ;
            replaceNullString(listOld.get(i).getAddress());
            diabetesN.setADDRESS(listOld.get(i).getAddress() ) ;
            replaceNullString(listOld.get(i).getXzd1());
            diabetesN.setDIAGNOSECODE(listOld.get(i).getXzd1()) ;
            replaceNullString(listOld.get(i).getXzd1());
            diabetesN.setDIAGNOSISBASISOTHER(listOld.get(i).getXzd1()) ;
            replaceNullString(listOld.get(i).getXhbz1());
            diabetesN.setCOMPLICATIONS(listOld.get(i).getXhbz1()) ;
            replaceNullString(listOld.get(i).getDisease_id());
            diabetesN.setICD_10_TEXT(listOld.get(i).getDisease_id()) ;
            replaceNullString(listOld.get(i).getZddw());
            diabetesN.setRECEPTION_ORG(listOld.get(i).getZddw());

         if(listOld.get(i).getDate_of_zd()==null){
             listOld.get(i).setDate_of_zd(new Date());
         }
            diabetesN. setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
         if(listOld.get(i).getDate_of_tb()==null){
             listOld.get(i).setDate_of_tb(new Date());
         }
            diabetesN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            replaceNullString(listOld.get(i).getPerson_of_tb());
            diabetesN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            listNew.add(diabetesN);
        }
        return listNew;
    }
}
