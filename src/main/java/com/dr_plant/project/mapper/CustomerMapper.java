package com.dr_plant.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.dr_plant.project.entity.CusTb;

@Mapper
public interface CustomerMapper {
	@Select("SELECT * FROM CUS_TB WHERE CUS_ID=#{cusId}")
	CusTb findBycusId(String cusId);
	
	@Update("UPDATE CUS_TB SET ALARM_AGREE=#{ALARM_AGREE} WHERE CUS_ID=#{CUS_ID}")
	void updateCustomerAlarmAgree(CusTb customer);
}
