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
public class SensorDataTb extends BaseTb {

	private String d_id;
	private String hum;
	private String temp;
	private String ws;
	private String wd;
	private String rf;
	private LocalDateTime measer_dt;
}
