package com.dr_plant.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.ExtrmnCmpTb;

@Mapper
public interface ExtrmnCmpMapper {
    @Select("SELECT * FROM EXTRMN_CMP_TB WHERE RGN_ID=#{rgnId}")
    List<ExtrmnCmpTb> findByrgnId(String rgnId);
    
    @Select("SELECT * FROM EXTRMN_CMP_TB WHERE RGN_ID=#{rgnId} LIMIT #{limit} OFFSET #{offset}")
    List<ExtrmnCmpTb> findByrgnIdWithPagination(@Param("rgnId") String rgnId, @Param("limit") int limit, @Param("offset") int offset);

    @Select("SELECT COUNT(*) FROM EXTRMN_CMP_TB WHERE RGN_ID=#{rgnId}")
    int countByrgnId(@Param("rgnId") String rgnId);
}
