package com.dr_plant.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.NajuWeatherTb;


@Mapper
public interface NajuWeatherMapper {
    
    @Select("SELECT *\r\n"
            + "FROM NAJU_WEATHER_TB\r\n"
            + "WHERE MEAS_DT IN (\r\n"
            + "    (SELECT MAX(MEAS_DT) FROM NAJU_WEATHER_TB),\r\n"
            + "    (SELECT MAX(MEAS_DT) - INTERVAL 24 HOUR FROM NAJU_WEATHER_TB),\r\n"
            + "    (SELECT MAX(MEAS_DT) - INTERVAL 48 HOUR FROM NAJU_WEATHER_TB)\r\n"
            + ")\r\n"
            + "ORDER BY MEAS_DT DESC;")
    List<NajuWeatherTb> findLatestWeatherData();
}