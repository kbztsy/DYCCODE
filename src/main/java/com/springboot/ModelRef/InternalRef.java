package com.dtsp.demo.ModelRef;

import com.dtsp.demo.ModelNew.InfectiousNew;
import com.dtsp.demo.ModelNew.InternalNew;
import com.dtsp.demo.ModelOld.InfectiousOld;
import com.dtsp.demo.ModelOld.InternalOld;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class InternalRef {

    @Autowired
    private List<InternalNew> listNew;
    @Autowired
    private InternalNew internalN;
    public List<InternalNew> REF(List<InternalOld> listOld){
        for (int i = 0;i<listOld.size();i++){

            internalN.setVISIT_NO(listOld.get(i).getMzzy_id());

            internalN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());

            internalN.setSICK_NAME(listOld.get(i).getPatient_name());

            internalN.setSICK_SEX(listOld.get(i).getSex_id());

            internalN.setBIRTHDAY(listOld.get(i).getDate_of_birth());

            listNew.add(internalN);
        }
        return listNew;
    }

}
