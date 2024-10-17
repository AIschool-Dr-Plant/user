package com.dr_plant.project.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.CmCodeTb;

public interface CmCodeMapper {
	
	@Select("SELECT * FROM CM_CODE_TB")
	public ArrayList<CmCodeTb> select();
	
}
