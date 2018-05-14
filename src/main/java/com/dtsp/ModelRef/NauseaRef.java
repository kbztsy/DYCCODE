package com.dtsp.ModelRef;

import com.dtsp.ModelNew.NauseaNew;
import com.dtsp.ModelOld.NauseaOld;
import com.dtsp.util.EqStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class NauseaRef {


    @Autowired
    private List<NauseaNew> listNew;
    @Autowired
    private NauseaNew nauseaN;
    @Resource
    private EqStr eqStr;
    public List<NauseaNew> REF(List<NauseaOld> listOld){
        for (int i = 0;i<listOld.size();i++){
           if(listOld.get(i).getMzzy_id()!=null){
               nauseaN.setVISIT_NO(listOld.get(i).getMzzy_id()) ;
           }
            if(listOld.get(i).getMzzy_id()!=null){
                nauseaN.setRESI_CASE_NO(listOld.get(i).getMzzy_id()) ;
            }
            if(listOld.get(i).getPatient_name()!=null){
                nauseaN.setSICK_NAME(listOld.get(i).getPatient_name()) ;
            }

            if(listOld.get(i).getNationality_id()!=null){
                nauseaN.setNATION(listOld.get(i).getNationality_id());
            }
            if(listOld.get(i).getOccupation_id()!=null){
                nauseaN.setOCCUPATION(listOld.get(i).getOccupation_id());
            }
            if(listOld.get(i).getDate_of_birth()!=null){
                nauseaN.setBIRTHDAY(listOld.get(i).getDate_of_birth()) ;
            }


            nauseaN.setMARRIAGE(listOld.get(i).getHyqk()) ;
            nauseaN.setIDENTITY_CARD_NO(listOld.get(i).getIdcard_no());
            nauseaN.setADDRESS(listOld.get(i).getAddress());
            nauseaN.setRESIDENCE_ADDRESS(listOld.get(i).getHk_address()) ;
               if(listOld.get(i).getHyqk()!=null&&listOld.get(i).getHyqk()!=""){
              nauseaN.setSMOKING( eqStr.RefStr(listOld.get(i).getHyqk())) ;
            }
            nauseaN.setPATHOLOGIC_TYPES(listOld.get(i).getBllx()) ;
            nauseaN.setDIAGNOSIS_T(listOld.get(i).getQzsqb()) ;
            nauseaN.setDIAGNOSIS_N(listOld.get(i).getQzsqb()) ;
            nauseaN.setDIAGNOSIS_M(listOld.get(i).getQzsqb());
            nauseaN.setDIAGNOSIS_NO(listOld.get(i).getQzsqb()) ;
            nauseaN.setICD_10(listOld.get(i).getDisease_id()) ;
            nauseaN.setICD_10_TEXT(listOld.get(i).getDisease_id());
            nauseaN.setCLINICAL_STAGE(listOld.get(i).getLcfq()) ;
            nauseaN.setICD_03(listOld.get(i).getIcdo3()) ;
            nauseaN.setICD_03_TEXT(listOld.get(i).getIcdo3());
            nauseaN.setDIFFERENTIAL_DEGREE(listOld.get(i).getFhcd()) ;
            nauseaN.setRECEPTION_ORG(listOld.get(i).getZddw()) ;
            nauseaN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd()) ;
            nauseaN.setCREATE_TIME(listOld.get(i).getDate_of_tb()) ;
            nauseaN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb()) ;
            listNew.add(nauseaN);
        }
        return listNew;
    }

}
