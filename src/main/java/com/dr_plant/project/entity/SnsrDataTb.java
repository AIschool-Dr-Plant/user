package com.dr_plant.project.entity;


import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SnsrDataTb extends BaseTb {

	private String dataId;
	private String ap;
	private String hum;
	private String temp;
	private String ws;
	private String wd;
	private String rf;
	private LocalDateTime meas_dt;
	private String devId;
}