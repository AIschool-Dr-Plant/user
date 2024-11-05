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

	private String cusId;
	private String cusPw;
	private String email;
	private String cusBday;
	private String cusNum;
	private Integer alarmAgree;
	private Integer infoAgree;
}