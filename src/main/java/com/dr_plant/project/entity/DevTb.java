package com.dr_plant.project.entity;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DevTb extends BaseTb {
	
	@JsonProperty("DEV_ID")
	private String DEV_ID;
	
	@JsonProperty("DEV_KIND_CD")
	private String DEV_KIND_CD;
	
	@JsonProperty("DEV_NM")
	private String DEV_NM;
	
	@JsonProperty("MANUF_DT")
	private LocalDateTime MANUF_DT;
	
	@JsonProperty("TGT_DEV_ID")
	private String TGT_DEV_ID;
}