package com.dr_plant.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true,callSuper = true)
public class PstFcstTb {

	private String CRP_CLF_NM;
	private String CRP_NM;
	private String PEST_NM;
	private Integer STATE_ID;
	private String STATE_NM;
}