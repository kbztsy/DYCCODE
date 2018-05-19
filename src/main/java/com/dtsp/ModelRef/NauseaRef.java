package com.dtsp.ModelRef;

import com.dtsp.ModelNew.NauseaNew;
import com.dtsp.ModelOld.NauseaOld;
import com.dtsp.util.EqStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class NauseaRef {

    @Resource
    private EqStr eqStr;
    public void replaceNullString(String str){
        if(str == null ) str = "";

    }
    public List<NauseaNew> REF(List<NauseaOld> listOld){
        List<NauseaNew> listNew = new ArrayList<>();
        for (int i = 0;i<listOld.size();i++){
            NauseaNew nauseaN = new NauseaNew();
            replaceNullString(listOld.get(i).getMzzy_id());
               nauseaN.setVISIT_NO(listOld.get(i).getMzzy_id()) ;

            replaceNullString(listOld.get(i).getMzzy_id());
                nauseaN.setRESI_CASE_NO(listOld.get(i).getMzzy_id()) ;
            replaceNullString(listOld.get(i).getPatient_name());

                nauseaN.setSICK_NAME(listOld.get(i).getPatient_name()) ;

            replaceNullString(listOld.get(i).getNationality_id());

                nauseaN.setNATION(listOld.get(i).getNationality_id());
            replaceNullString(listOld.get(i).getOccupation_id());
                nauseaN.setOCCUPATION(listOld.get(i).getOccupation_id());

            if(listOld.get(i).getDate_of_birth()==null){
                listOld.get(i).setDate_of_birth(new Date());
            }
            nauseaN.setBIRTHDAY(listOld.get(i).getDate_of_birth()) ;
            replaceNullString(listOld.get(i).getHyqk());
            nauseaN.setMARRIAGE(listOld.get(i).getHyqk()) ;
            replaceNullString(listOld.get(i).getIdcard_no());
            nauseaN.setIDENTITY_CARD_NO(listOld.get(i).getIdcard_no());
            replaceNullString(listOld.get(i).getAddress());
            nauseaN.setADDRESS(listOld.get(i).getAddress());
            replaceNullString(listOld.get(i).getHk_address());
            nauseaN.setRESIDENCE_ADDRESS(listOld.get(i).getHk_address()) ;
               if(listOld.get(i).getHyqk()!=null&&listOld.get(i).getHyqk()!=""){
              nauseaN.setSMOKING( eqStr.RefStr(listOld.get(i).getHyqk())) ;
            }
            replaceNullString(listOld.get(i).getBllx());
            nauseaN.setPATHOLOGIC_TYPES(listOld.get(i).getBllx()) ;
            replaceNullString(listOld.get(i).getQzsqb());
            nauseaN.setDIAGNOSIS_T(listOld.get(i).getQzsqb()) ;
            replaceNullString(listOld.get(i).getQzsqb());
            nauseaN.setDIAGNOSIS_N(listOld.get(i).getQzsqb()) ;
            replaceNullString(listOld.get(i).getQzsqb());
            nauseaN.setDIAGNOSIS_M(listOld.get(i).getQzsqb());
            replaceNullString(listOld.get(i).getQzsqb());
            nauseaN.setDIAGNOSIS_NO(listOld.get(i).getQzsqb()) ;
            replaceNullString(listOld.get(i).getDisease_id());
            nauseaN.setICD_10(listOld.get(i).getDisease_id()) ;
            replaceNullString(listOld.get(i).getDisease_id());
            nauseaN.setICD_10_TEXT(listOld.get(i).getDisease_id());
            replaceNullString(listOld.get(i).getLcfq());
            nauseaN.setCLINICAL_STAGE(listOld.get(i).getLcfq()) ;
            replaceNullString(listOld.get(i).getIcdo3());
            nauseaN.setICD_03(listOld.get(i).getIcdo3()) ;
            replaceNullString(listOld.get(i).getIcdo3());
            nauseaN.setICD_03_TEXT(listOld.get(i).getIcdo3());
            replaceNullString(listOld.get(i).getFhcd());
            nauseaN.setDIFFERENTIAL_DEGREE(listOld.get(i).getFhcd()) ;
            replaceNullString(listOld.get(i).getZddw());
            nauseaN.setRECEPTION_ORG(listOld.get(i).getZddw()) ;
            if(listOld.get(i).getDate_of_zd()==null){
                listOld.get(i).setDate_of_zd(new Date());
            }
            nauseaN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd()) ;
          if(listOld.get(i).getDate_of_tb()==null){
              listOld.get(i).setDate_of_tb(new Date());
          }
            nauseaN.setCREATE_TIME(listOld.get(i).getDate_of_tb()) ;
            replaceNullString(listOld.get(i).getPerson_of_tb());
            nauseaN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb()) ;
            listNew.add(nauseaN);
        }
        return listNew;
    }

}
