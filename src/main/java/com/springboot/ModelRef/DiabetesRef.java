package com.springboot.ModelRef;

import com.springboot.ModelNew.DiabetesNew;
import com.springboot.ModelOld.DiabetesOld;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class DiabetesRef {

    @Autowired
    private List<DiabetesNew> listNew;
    @Autowired
    private DiabetesNew diabetesN;
    public List<DiabetesNew> REF(List<DiabetesOld> listOld){
        for (int i = 0;i<listOld.size();i++){

            diabetesN.setVISIT_NO(listOld.get(i).getMzzy_id()) ;
            diabetesN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());
            diabetesN.setSICK_NAME(listOld.get(i).getPatient_name()) ;
            diabetesN.setSICK_SEX(listOld.get(i).getSex_id());
            diabetesN.setNATION(listOld.get(i).getNationality_id()) ;
            diabetesN.setOCCUPATION(listOld.get(i).getOccupation_id());
            diabetesN.setBIRTHDAY(listOld.get(i).getDate_of_birth()) ;
            diabetesN.setADDRESS(listOld.get(i).getAddress()) ;
            diabetesN.setDIAGNOSECODE(listOld.get(i).getXzd1()) ;
            diabetesN.setDIAGNOSISBASISOTHER(listOld.get(i).getXzd1()) ;
            diabetesN.setCOMPLICATIONS(listOld.get(i).getXhbz1()) ;
            diabetesN.setICD_10_TEXT(listOld.get(i).getDisease_id()) ;
            diabetesN.setRECEPTION_ORG(listOld.get(i).getZddw());
            diabetesN. setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
           // diabetesN.setTbdw(listOld.get(i).) ;
            diabetesN.setDate_of_tb(listOld.get(i).getDate_of_tb()) ;
            diabetesN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            listNew.add(diabetesN);
        }
        return listNew;
    }
}
