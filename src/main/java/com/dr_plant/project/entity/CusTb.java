package com.dr_plant.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true,callSuper = true)
public class CusTb extends BaseTb {

	private String CUS_ID;
	private String CUS_PW;
	private String EMAIL;
	private String CUS_BDAY;
	private String CUS_NUM;
	private Integer ALARM_AGREE;
	private Integer INFO_AGREE;
}