package com.springboot.ModelRef;

import com.springboot.ModelNew.InternalNew;
import com.springboot.ModelOld.InternalOld;
import com.springboot.util.DateStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class InternalRef {
    @Autowired
    private List<InternalNew> listNew;
    @Autowired
    private InternalNew internalN;
    @Resource
    private RandNum randNum;
    @Resource
    private RandNumber randNumber;
    @Resource
    private RandString randString;
    @Resource
    private DateStr dateStr;
    public List<InternalNew> REF(List<InternalOld> listOld){
        for (int i = 0;i<listOld.size();i++){
            internalN.setFID(randNumber.Randint());
            internalN.setID(randString.RandStr());
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
