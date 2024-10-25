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
public class DevTb extends BaseTb {

	private String devId;
	private String devKindCd;
	private String devNm;
	private LocalDateTime manufDt;
	private String tgtDevId;
}