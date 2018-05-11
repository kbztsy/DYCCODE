package com.springboot.ModelRef;

import com.springboot.ModelNew.HurtNew;
import com.springboot.ModelOld.HurtOld;
import com.springboot.util.DateStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class HurtRef {

    @Autowired
    private List<HurtNew> listNew;
    @Autowired
    private HurtNew hurtN;
    @Resource
    private RandNum randNum;
    @Resource
    private DateStr dateStr;
    @Resource
    private RandNumber randNumber;
    @Resource
    private RandString randString;
    public List<HurtNew> REF(List<HurtOld> listOld) {
        for (int i = 0; i < listOld.size(); i++) {
            hurtN.setFID(randNumber.Randint());
            hurtN.setID(randString.RandStr());
            hurtN.setSICK_NAME(listOld.get(i).getPatient_name());
            hurtN.setSICK_SEX(listOld.get(i).getSex_id());
            hurtN.setNATION(listOld.get(i).getNationality_id());
            hurtN.setZONE_TYPE(listOld.get(i).getHj());
            hurtN.setBIRTHDAY( listOld.get(i).getDate_of_birth());
            hurtN.setOCCUPATION(listOld.get(i).getOccupation_id());
            hurtN.setADDRESS(listOld.get(i).getAddress());
            hurtN.setHARM_REASON(listOld.get(i).getXzd());
            hurtN.setDELIBERATELY(listOld.get(i).getSfgy());
            hurtN.setHARM_PART(listOld.get(i).getXshbw());
            hurtN.setPART_OTHER_TEXT(listOld.get(i).getXshbw());
            hurtN.setTAKE_PLACE(listOld.get(i).getFsdd());
            hurtN.setSEVERITY(listOld.get(i).getYzcd());
            hurtN.setOCCURRED_DATE( listOld.get(i).getFs_date());
            hurtN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            hurtN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            listNew.add(hurtN);
        }
        return listNew;
    }

}
