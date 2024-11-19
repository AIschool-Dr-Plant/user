package com.dr_plant.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VeiwRgnMapper {
    
    @Select("SELECT RGN_NM FROM VIEW_RGN WHERE RGN_ID = #{rgnId}")
    String findRgnNmByRgnId(String rgnId);
}