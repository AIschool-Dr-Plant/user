package com.dr_plant.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.DevTb;

@Mapper
public interface DeviceMapper {

    @Select("SELECT * FROM DEV_TB WHERE DEV_ID = #{devId}")
    DevTb findDeviceByDevId(String devId);
}
