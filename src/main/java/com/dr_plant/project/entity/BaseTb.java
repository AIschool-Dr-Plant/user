package com.dr_plant.project.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BaseTb {

	private String REG_ID;
	private String MOD_ID;
	private LocalDateTime REG_DT;
	private LocalDateTime MOD_DT;
}
