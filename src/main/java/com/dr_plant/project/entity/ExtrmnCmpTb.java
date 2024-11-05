package com.dr_plant.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExtrmnCmpTb extends BaseTb {

	private Integer cmpId;
	private String cmpNm;
	private String fullAddr;
	private String addr;
	private String addrDet;
	private String bizDiv;
	private String cont;
	private String remarks;
	private String rgnId;
}