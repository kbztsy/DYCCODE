package com.dtsp.ModelRef;

import com.dtsp.ModelNew.InternalNew;
import com.dtsp.ModelOld.InternalOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class InternalRef {

    @Autowired
    private List<InternalNew> listNew;
    @Autowired
    private InternalNew internalN;
    public void replaceNullString(String str){
        if(str == null ) str = "";

    }
    public List<InternalNew> REF(List<InternalOld> listOld){
        List<InternalNew> listNew = new ArrayList<>();
        for (int i = 0;i<listOld.size();i++){
            InternalNew internalN =new InternalNew();
            replaceNullString(listOld.get(i).getMzzy_id());
            internalN.setVISIT_NO(listOld.get(i).getMzzy_id().trim());
            replaceNullString(listOld.get(i).getMzzy_id());
            internalN.setRESI_CASE_NO(listOld.get(i).getMzzy_id().trim());
            replaceNullString(listOld.get(i).getPatient_name());
            internalN.setSICK_NAME(listOld.get(i).getPatient_name().trim());
            replaceNullString(listOld.get(i).getSex_id());
            internalN.setSICK_SEX(listOld.get(i).getSex_id().trim());
            if(listOld.get(i).getDate_of_birth()==null){
                listOld.get(i).setDate_of_birth(new Date());
            }
            internalN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            listNew.add(internalN);
        }
        return listNew;
    }

}
