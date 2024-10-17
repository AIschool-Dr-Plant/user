package com.dr_plant.project.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;


@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true,includeFieldNames = true)
public class CmCodeTb extends BaseTb {
	
	private String cm_code;
	private String cm_code_name;

}
