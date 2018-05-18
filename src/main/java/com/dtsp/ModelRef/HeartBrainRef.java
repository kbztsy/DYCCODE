package com.dtsp.ModelRef;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.util.EqStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class HeartBrainRef {
    @Autowired
    private List<HeartBrainNew> listNew;
    @Autowired
    private HeartBrainNew heartBrainN;
    @Resource
    private EqStr eqStr;
    public List<HeartBrainNew> REF(List<HeartBrainOld> listOld){
        for (int i = 0;i<listOld.size();i++){

            heartBrainN.setVISIT_NO(listOld.get(i).getMzzy_id());
            heartBrainN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());
            heartBrainN.setSICK_NAME(listOld.get(i).getPatient_name());
            heartBrainN.setSICK_SEX(listOld.get(i).getSex_id());
            heartBrainN.setNATION(listOld.get(i).getNationality_id());
            heartBrainN.setOCCUPATION(listOld.get(i).getOccupation_id());
            heartBrainN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            heartBrainN.setADDRESS(listOld.get(i).getAddress());
            if(listOld.get(i).getXyqk()!=null||listOld.get(i).getXyqk()!=""){
                heartBrainN.setSMOKING(eqStr.RefStr(listOld.get(i).getXyqk()));
            }

            heartBrainN.setDIAGNOSECODE(listOld.get(i).getXzd());
            heartBrainN.setDIAGNOSISBASIS(listOld.get(i).getXzd());
            heartBrainN.setDIAGNOSISBASISOTHER(listOld.get(i).getXzd());
            heartBrainN.setRECEPTION_ORG(listOld.get(i).getZddw());
            heartBrainN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
            heartBrainN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            heartBrainN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            listNew.add(heartBrainN);
        }
        return listNew;
    }
}