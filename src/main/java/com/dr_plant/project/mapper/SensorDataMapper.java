package com.dr_plant.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.SnsrDataTb;

public interface SensorDataMapper {

    @Select("SELECT * FROM SNSR_DATA_TB WHERE DEV_ID = #{devId} ORDER BY MEAS_DT")
    List<SnsrDataTb> findSnsrDataByDevId(String devId);

}
