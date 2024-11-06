package com.dr_plant.project.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.TemPestTb;

@Mapper
public interface TemPestMapper {
    @Select("SELECT * FROM TEMP_PEST_TB WHERE RGN_ID=#{rgnId} ORDER BY REG_DT DESC LIMIT 1")
    List<TemPestTb> findByRgnId(String rgnId);
}
