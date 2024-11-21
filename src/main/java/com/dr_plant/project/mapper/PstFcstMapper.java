package com.dr_plant.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.PstFcstTb;


@Mapper
public interface PstFcstMapper {
	  @Select("SELECT PEST_NM, CRP_NM, CRP_CLF_NM, STATE_ID, STATE_NM FROM PST_FCST_TB LIMIT #{offset}, #{limit}")
	    List<PstFcstTb> getPaginatedData(int offset, int limit);

	    @Select("SELECT COUNT(*) FROM PST_FCST_TB")
	    int getTotalCount();
}
