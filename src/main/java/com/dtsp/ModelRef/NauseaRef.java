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

            nauseaN.setVISIT_NO(listOld.get(i).getMzzy_id().trim()) ;
            nauseaN.setRESI_CASE_NO(listOld.get(i).getMzzy_id().trim()) ;
            nauseaN.setSICK_NAME(listOld.get(i).getPatient_name().trim()) ;
            nauseaN.setSICK_SEX(listOld.get(i).getSex_id().trim());
            nauseaN.setNATION(listOld.get(i).getNationality_id().trim());
            nauseaN.setOCCUPATION(listOld.get(i).getOccupation_id().trim());
            nauseaN.setBIRTHDAY(listOld.get(i).getDate_of_birth()) ;
            nauseaN.setMARRIAGE(listOld.get(i).getHyqk().trim()) ;
            nauseaN.setIDENTITY_CARD_NO(listOld.get(i).getIdcard_no().trim());
            nauseaN.setADDRESS(listOld.get(i).getAddress().trim());
            nauseaN.setRESIDENCE_ADDRESS(listOld.get(i).getHk_address().trim()) ;
               if(listOld.get(i).getHyqk()!=null||listOld.get(i).getHyqk()!=""){
              nauseaN.setSMOKING( eqStr.RefStr(listOld.get(i).getHyqk())) ;
            }
            nauseaN.setPATHOLOGIC_TYPES(listOld.get(i).getBllx().trim()) ;
            nauseaN.setDIAGNOSIS_T(listOld.get(i).getQzsqb().trim()) ;
            nauseaN.setDIAGNOSIS_N(listOld.get(i).getQzsqb().trim()) ;
            nauseaN.setDIAGNOSIS_M(listOld.get(i).getQzsqb().trim());
            nauseaN.setDIAGNOSIS_NO(listOld.get(i).getQzsqb().trim()) ;
            nauseaN.setICD_10(listOld.get(i).getDisease_id().trim()) ;
            nauseaN.setICD_10_TEXT(listOld.get(i).getDisease_id().trim());
            nauseaN.setCLINICAL_STAGE(listOld.get(i).getLcfq().trim()) ;
            nauseaN.setICD_03(listOld.get(i).getIcdo3().trim()) ;
            nauseaN.setICD_03_TEXT(listOld.get(i).getIcdo3().trim());
            nauseaN.setDIFFERENTIAL_DEGREE(listOld.get(i).getFhcd().trim()) ;
            nauseaN.setRECEPTION_ORG(listOld.get(i).getZddw().trim()) ;
            nauseaN.setRECEPTION_TIME(listOld.get(i).getDate_of_zd()) ;
            nauseaN.setCREATE_TIME(listOld.get(i).getDate_of_tb()) ;
            nauseaN.setWRITE_DOCTOR(listOld.get(i).getPerson_of_tb().trim()) ;
       //     nauseaN.setDIAGNOSECODE(listOld.get(i).get);
          //  nauseaN.setDIAGNOSISBASIS(listOld.get(i).get);
         //   nauseaN.setDIAGNOSISBASISOTHER(listOld.get(i).get);
        //    nauseaN.setDETAILED_DIAGNOSIS(listOld.get(i).get);
            listNew.add(nauseaN);
        }
        return listNew;
    }

}
