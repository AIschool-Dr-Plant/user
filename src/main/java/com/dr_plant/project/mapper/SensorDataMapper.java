package com.dr_plant.project.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.SnsrDataTb;

public interface SensorDataMapper {

	@Select("SELECT * FROM SNSR_DATA_TB")
	ArrayList<SnsrDataTb> select();

}
