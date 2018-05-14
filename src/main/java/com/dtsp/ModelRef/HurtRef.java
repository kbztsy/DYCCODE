package com.dtsp.ModelRef;

import com.dtsp.ModelNew.HurtNew;
import com.dtsp.ModelOld.HurtOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HurtRef {

    @Autowired
    private List<HurtNew> listNew;
    @Autowired
    private HurtNew hurtN;

    public List<HurtNew> REF(List<HurtOld> listOld) {
        for (int i = 0; i < listOld.size(); i++) {

            hurtN.setSICK_NAME(listOld.get(i).getPatient_name().trim());
            hurtN.setSICK_SEX(listOld.get(i).getSex_id().trim());
            hurtN.setNATION(listOld.get(i).getNationality_id().trim());
            hurtN.setZONE_TYPE(listOld.get(i).getHj().trim());
            hurtN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            hurtN.setOCCUPATION(listOld.get(i).getOccupation_id().trim());
            hurtN.setADDRESS(listOld.get(i).getAddress().trim());
            hurtN.setHARM_REASON(listOld.get(i).getXzd().trim());
            hurtN.setDELIBERATELY(listOld.get(i).getSfgy().trim());
            hurtN.setHARM_PART(listOld.get(i).getXshbw().trim());
            hurtN.setPART_OTHER_TEXT(listOld.get(i).getXshbw().trim());
            hurtN.setTAKE_PLACE(listOld.get(i).getFsdd().trim());
            hurtN.setSEVERITY(listOld.get(i).getYzcd().trim());
            hurtN.setOCCURRED_DATE(listOld.get(i).getFs_date());
            hurtN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            hurtN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb().trim());

            listNew.add(hurtN);
        }
        return listNew;
    }

}
