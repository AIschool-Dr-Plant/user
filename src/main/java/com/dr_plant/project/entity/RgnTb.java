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
public class RgnTb extends BaseTb {

	private String rgnId;
	private String rgnNm;
	private String distId;
	private String distNm;
}