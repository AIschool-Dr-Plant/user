package com.dr_plant.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.dr_plant.project.entity.NewsTb;


@Mapper
public interface NewsMapper {
    
    // Select the latest 3 news items by PUB_DT
    @Select("SELECT NEWS_ID, PUB, TITLE, REPORTER, URL, PUB_DT FROM NEWS_TB ORDER BY PUB_DT DESC LIMIT 8")
    List<NewsTb> findLatestNews();
    
    @Select("SELECT NEWS_ID, PUB, TITLE, REPORTER, URL, PUB_DT FROM NEWS_TB ORDER BY PUB_DT DESC LIMIT #{limit} OFFSET #{offset}")
    List<NewsTb> findNewsByPage(int offset, int limit);
    
    @Select("SELECT COUNT(*) FROM NEWS_TB")
    int countTotalNews();
}