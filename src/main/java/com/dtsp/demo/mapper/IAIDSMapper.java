package com.dtsp.demo.mapper;

import com.dtsp.demo.ModelOld.AIDSOld;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IAIDSMapper {
    @Select("select MZZY_ID,MZZY_FLAG,MarriageState_ID,CultureDegree_ID" +
            ",CRLY,RQLB,GQXBS,LB,JRSY,SZQPZ,SZDSYYYTGR from FBK_BKBZ_AZ_RECORD " +
            " WHERE 1=1")
    List<AIDSOld> findAIDS();
}
