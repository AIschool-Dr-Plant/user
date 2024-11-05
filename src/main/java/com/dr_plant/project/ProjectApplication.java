package com.dr_plant.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.dr_plant.project.mapper") // 매퍼 스캔 설정
public class ProjectApplication {
	
	public static void main(String[] args) {
		String profile = System.getProperty("spring.profiles.active");
		if (profile == null) System.setProperty("spring.profiles.active", "local");
		SpringApplication.run(ProjectApplication.class, args);
	}

}
