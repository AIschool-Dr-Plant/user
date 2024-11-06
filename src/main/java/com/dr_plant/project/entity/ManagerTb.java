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
public class ManagerTb extends BaseTb {

	private String MGR_ID;
	private String MGR_PW;
	private String DEPT_CD;
	private String DEPT_NM;
}