package com.dtsp.ModelRef;

import com.dtsp.ModelNew.InfectiousNew;
import com.dtsp.ModelOld.InfectiousOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InfectiousRef {

    @Autowired
    private List<InfectiousNew> listNew;
    @Autowired
    private InfectiousNew infectiousN;
    public List<InfectiousNew> REF(List<InfectiousOld> listOld){
        for (int i = 0;i<listOld.size();i++){
            infectiousN.setVISIT_NO(listOld.get(i).getMzzy_id());
            infectiousN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());
            infectiousN.setSICK_NAME(listOld.get(i).getPatient_name());
            infectiousN.setSICK_PARENT_NAME(listOld.get(i).getHejz_name());
            infectiousN.setIDENTITY_CARD_NO(listOld.get(i).getIdcard_no());
            infectiousN.setSICK_SEX(listOld.get(i).getSex_id());
            infectiousN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            infectiousN.setSICK_PHONE(listOld.get(i).getTelephone());
            infectiousN.setWORK_PLACE(listOld.get(i).getGzdw());
            infectiousN.setSICK_BELONG(listOld.get(i).getBrsy());
            infectiousN.setADDRESS(listOld.get(i).getAddress());
            infectiousN.setOCCUPATION(listOld.get(i).getOccupation_id());
            infectiousN.setDIAGNOSIS_TYPE_CODE(listOld.get(i).getXblfl1());
            infectiousN.setCASETYPE(listOld.get(i).getXblfl2());
            infectiousN. setACCIDENT_DATE(listOld.get(i).getFb_date());
            infectiousN.setDIAGNOSE_DATE(listOld.get(i).getDate_of_zd());
            infectiousN.setDEATH_DATE(listOld.get(i).getDare_date());
            infectiousN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            infectiousN.setCREATE_TIME(listOld.get(i).getDate_of_tb()) ;
            listNew.add(infectiousN);
        }
        return listNew;
    }
}
