package com.dtsp.ModelRef;

import com.dtsp.ModelNew.InternalNew;
import com.dtsp.ModelOld.InternalOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InternalRef {

    @Autowired
    private List<InternalNew> listNew;
    @Autowired
    private InternalNew internalN;
    public List<InternalNew> REF(List<InternalOld> listOld){
        for (int i = 0;i<listOld.size();i++){

            internalN.setVISIT_NO(listOld.get(i).getMzzy_id().trim());

            internalN.setRESI_CASE_NO(listOld.get(i).getMzzy_id().trim());

            internalN.setSICK_NAME(listOld.get(i).getPatient_name().trim());

            internalN.setSICK_SEX(listOld.get(i).getSex_id().trim());

            internalN.setBIRTHDAY(listOld.get(i).getDate_of_birth());

            listNew.add(internalN);
        }
        return listNew;
    }

}
