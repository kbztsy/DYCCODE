package com.dtsp.ModelRef;

import com.dtsp.ModelNew.DiabetesNew;
import com.dtsp.ModelOld.DiabetesOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DiabetesRef {
    @Autowired
    private List<DiabetesNew> listNew;
    @Autowired
    private DiabetesNew diabetesN;
    public List<DiabetesNew> REF(List<DiabetesOld> listOld){
        for (int i = 0;i<listOld.size();i++){

            diabetesN.setVISIT_NO(listOld.get(i).getMzzy_id().trim()) ;
            diabetesN.setRESI_CASE_NO(listOld.get(i).getMzzy_id().trim());
            diabetesN.setSICK_NAME(listOld.get(i).getPatient_name().trim()) ;
            diabetesN.setSICK_SEX(listOld.get(i).getSex_id().trim());
            diabetesN.setNATION(listOld.get(i).getNationality_id().trim()) ;
            diabetesN.setOCCUPATION(listOld.get(i).getOccupation_id().trim());
            diabetesN.setBIRTHDAY(listOld.get(i).getDate_of_birth()) ;
            diabetesN.setADDRESS(listOld.get(i).getAddress().trim()) ;
            diabetesN.setDIAGNOSECODE(listOld.get(i).getXzd1().trim()) ;
            diabetesN.setDIAGNOSISBASISOTHER(listOld.get(i).getXzd1().trim()) ;
            diabetesN.setCOMPLICATIONS(listOld.get(i).getXhbz1().trim()) ;
            diabetesN.setICD_10_TEXT(listOld.get(i).getDisease_id().trim()) ;
            diabetesN.setRECEPTION_ORG(listOld.get(i).getZddw().trim());
            diabetesN. setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
           // diabetesN.setTbdw(listOld.get(i).) ;
         //   diabetesN.setDate_of_tb(listOld.get(i).getDate_of_tb()) ;
            diabetesN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb().trim());
            listNew.add(diabetesN);
        }
        return listNew;
    }
}
