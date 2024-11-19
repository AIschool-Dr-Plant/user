package com.dr_plant.project.mapper;


import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.IntLocTb;

@Mapper
public interface IntLocMapper {
    @Select("SELECT LOC_NICK FROM INT_LOC_TB WHERE CUS_ID = #{cusId}")
    List<String> findLocNickByCusId(String cusId);
	
    @Select("SELECT DEV_ID FROM INT_LOC_TB WHERE LOC_NICK = #{locNick}")
    String findDevIdByLocNick(String locNick);
	
	@Select("SELECT i.*, v.RGN_NM " +
	        "FROM INT_LOC_TB i " +
	        "JOIN VIEW_RGN v ON i.RGN_ID = v.RGN_ID " +
	        "WHERE i.CUS_ID = #{cusId}")
	List<IntLocTb> findBycusIdWithRegionName(String cusId);
	
	@Delete("DELETE FROM INT_LOC_TB WHERE LOC_ID = #{locId}")
	void deleteByLocId(Integer locId);
	
	@Insert("INSERT INTO INT_LOC_TB (LOC_NICK, DEV_ID, RGN_ID, CUS_ID, REG_ID, REG_DT) VALUES (#{LOC_NICK}, #{DEV_ID}, #{RGN_ID}, #{CUS_ID}, #{CUS_ID}, NOW())")
	void insertLocation(IntLocTb location);
	
	@Select("SELECT LOC_NICK, CUS_ID, RGN_ID FROM INT_LOC_TB WHERE LOC_NICK = #{locNick}")
	IntLocTb findLocNickAndCusIdByLocNick(String locNick);
}
