package com.dr_plant.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.ExtrmnCmpTb;

@Mapper
public interface ExtrmnCmpMapper {
    @Select("SELECT * FROM EXTRMN_CMP_TB WHERE RGN_ID=#{rgnId}")
    List<ExtrmnCmpTb> findByrgnId(String rgnId);
}
