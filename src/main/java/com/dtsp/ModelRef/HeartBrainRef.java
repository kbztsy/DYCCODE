package com.dtsp.ModelRef;

import com.dtsp.ModelNew.HeartBrainNew;
import com.dtsp.ModelOld.HeartBrainOld;
import com.dtsp.util.EqStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class HeartBrainRef {
    @Resource
    private EqStr eqStr;
    public void replaceNullString(String str){
        if(str == null ) str = "";

    }
    public List<HeartBrainNew> REF(List<HeartBrainOld> listOld){
        List<HeartBrainNew> listNew = new ArrayList<>();
        for (int i = 0;i<listOld.size();i++){
            HeartBrainNew heartBrainN = new HeartBrainNew();
            replaceNullString(listOld.get(i).getMzzy_id());
            heartBrainN.setVISIT_NO(listOld.get(i).getMzzy_id());
            replaceNullString(listOld.get(i).getMzzy_id());
            heartBrainN.setRESI_CASE_NO(listOld.get(i).getMzzy_id());
            replaceNullString(listOld.get(i).getPatient_name());
            heartBrainN.setSICK_NAME(listOld.get(i).getPatient_name());
            replaceNullString(listOld.get(i).getSex_id());
            heartBrainN.setSICK_SEX(listOld.get(i).getSex_id());
            replaceNullString(listOld.get(i).getNationality_id());
            heartBrainN.setNATION(listOld.get(i).getNationality_id());
            replaceNullString(listOld.get(i).getOccupation_id());
            heartBrainN.setOCCUPATION(listOld.get(i).getOccupation_id());
          if(listOld.get(i).getDate_of_birth()==null){
              listOld.get(i).setDate_of_birth(new Date());
          }
            heartBrainN.setBIRTHDAY(listOld.get(i).getDate_of_birth());
            replaceNullString(listOld.get(i).getAddress());
            heartBrainN.setADDRESS(listOld.get(i).getAddress());
            if(listOld.get(i).getXyqk()!=null||listOld.get(i).getXyqk()!=""){
                heartBrainN.setSMOKING(eqStr.RefStr(listOld.get(i).getXyqk()));
            }
            replaceNullString(listOld.get(i).getXzd());
            heartBrainN.setDIAGNOSECODE(listOld.get(i).getXzd());
            replaceNullString(listOld.get(i).getXzd());
            heartBrainN.setDIAGNOSISBASIS(listOld.get(i).getXzd());
            replaceNullString(listOld.get(i).getXzd());
            heartBrainN.setDIAGNOSISBASISOTHER(listOld.get(i).getXzd());
            replaceNullString(listOld.get(i).getZddw());
            heartBrainN.setRECEPTION_ORG(listOld.get(i).getZddw());
           if(listOld.get(i).getDate_of_zd()==null){
               listOld.get(i).setDate_of_zd(new Date());
           }
            heartBrainN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd());
          if(listOld.get(i).getDate_of_tb()==null){
              listOld.get(i).setDate_of_tb(new Date());
          }
            heartBrainN.setCREATE_TIME(listOld.get(i).getDate_of_tb());
            replaceNullString(listOld.get(i).getPerson_of_tb());
            heartBrainN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb());
            heartBrainN.setBKLX_ID(listOld.get(i).getBKLX_ID());
            listNew.add(heartBrainN);
        }
        return listNew;
    }
}
