package com.dr_plant.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.ManagerTb;


@Mapper
public interface ManagerMapper {
	@Select("SELECT * FROM MGR_TB WHERE MGR_ID=#{cusId}")
	ManagerTb findBymanagerId(String cusId);
}
