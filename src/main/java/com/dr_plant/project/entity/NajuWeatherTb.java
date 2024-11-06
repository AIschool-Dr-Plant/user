package com.dr_plant.project.entity;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class NajuWeatherTb {

	private Integer DATA_ID;
	private String AP;
	private String HUM;
	private String TEMP;
	private String WS;
	private String WD;
	private String RF;
	private LocalDateTime MEAS_DT;
	private String REG_ID;
	private LocalDateTime REG_DT;
}