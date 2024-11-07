package com.dr_plant.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntLocTb extends BaseTb {

	private Integer LOC_ID;
	private String LOC_NICK;
	private String CUS_ID;
	private String DEV_ID;
	private String RGN_ID;
	private String RGN_NM;
}