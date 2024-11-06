package com.dr_plant.project.mapper;


import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.IntLocTb;

@Mapper
public interface IntLocMapper {
	@Select("SELECT * FROM INT_LOC_TB WHERE CUS_ID=#{cusId}")
	List<IntLocTb> findBycusId(String cusId);
	
	@Select("SELECT * FROM INT_LOC_TB WHERE LOC_NICK=#{locNick} LIMIT 1")
    Optional<IntLocTb> findByLocNick(String locNick);
}
