package com.dtsp.demo.mapper;

import com.dtsp.demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by Administrator on 2018-04-27.
 */
@Mapper
public interface IUserMapper {
    @Select("select * from test01 where t1 = #{t1}")
    User findUserByUserid(@Param("t1") String t1);
    @Insert("insert into test01(t1,t2) values (#{t1},#{t2})")
    boolean insertUsers(@Param("t1") String t1, @Param("t2") String t2);
}
