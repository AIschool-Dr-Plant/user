package com.dr_plant.project.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BaseTb {

	private int idx;
	private String reg_id;
	private String mod_id;
	private LocalDateTime reg_dt;
	private LocalDateTime mod_dt;
}
