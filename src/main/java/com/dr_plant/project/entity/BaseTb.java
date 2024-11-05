package com.dr_plant.project.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BaseTb {

	private String regId;
	private String modId;
	private LocalDateTime regDt;
	private LocalDateTime modDt;
}
