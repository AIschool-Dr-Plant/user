package com.dr_plant.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.CusTb;

@Mapper
public interface CustomerMapper {
	@Select("SELECT * FROM CUS_TB WHERE CUS_ID=#{cusId}")
	CusTb findBycusId(String cusId);
}
