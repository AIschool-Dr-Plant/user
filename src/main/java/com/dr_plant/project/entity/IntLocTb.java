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

	private Integer locId;
	private String locNick;
	private String cusId;
	private String devId;
	private String rgnId;
}