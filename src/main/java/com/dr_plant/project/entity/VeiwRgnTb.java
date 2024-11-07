package com.dr_plant.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeiwRgnTb extends BaseTb {
	private String RGN_ID;
	private String RGN_NM;
	private String AREA_CD;
}