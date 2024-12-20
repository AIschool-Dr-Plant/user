package com.dr_plant.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.ExtrmnCmpTb;

@Mapper
public interface ExtrmnCmpMapper {
	@Select("SELECT COUNT(*) FROM EXTRMN_CMP_TB")
	int getTotalCompanyCount();

	@Select("SELECT * FROM EXTRMN_CMP_TB LIMIT #{offset}, #{limit}")
	List<ExtrmnCmpTb> getPaginatedData(@Param("offset") int offset, @Param("limit") int limit);
}
