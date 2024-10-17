package com.dr_plant.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.dr_plant.project.mapper") // 매퍼 스캔 설정
public class ProjectApplication {
	

	public static void main(String[] args) {
		String profile = System.getenv("PROJECT_PROFILE");
		if (profile == null) {
			profile = "local"; // 기본값 설정
		}
		System.setProperty("spring.profiles.active", profile);


		SpringApplication.run(ProjectApplication.class, args);
	}

}
