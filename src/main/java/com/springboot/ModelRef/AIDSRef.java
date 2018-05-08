package com.springboot.ModelRef;

import com.springboot.ModelNew.AIDSNew;
import com.springboot.ModelOld.AIDSOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AIDSRef {
    @Autowired
    private List<AIDSNew> listNew;
    @Autowired
    private AIDSNew aidsN;
    public List<AIDSNew> REF(List<AIDSOld> listOld){
        for (int i = 0;i<listOld.size();i++){
           aidsN.setMARRIAGE(listOld.get(i).getMarriagestate_id());
           aidsN.setEDUCATIONLEVEL_CODE(listOld.get(i).getCulturedegree_id());
           aidsN.setPOSSIBLE_INFECTION_ROUTE_CODE(listOld.get(i).getCrly());
           aidsN.setVENEREAL_HISTORY_CODE(listOld.get(i).getGqxbs());
           aidsN.setCHLAMYDIAL_TRACHOMATIS_CODE(listOld.get(i).getXszdsyyytgr());
           listNew.add(aidsN);
        }
        return listNew;
    }
}
