package com.dr_plant.project.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntLocTb extends BaseTb {
	
	@JsonProperty("LOC_ID")
	private Integer LOC_ID;
	
	@JsonProperty("LOC_NICK")
	private String LOC_NICK;
	
	@JsonProperty("CUS_ID")
	private String CUS_ID;
	
	@JsonProperty("DEV_ID")
	private String DEV_ID;
	
	@JsonProperty("RGN_ID")
	private String RGN_ID;
	
	@JsonProperty("RGN_NM")
	private String RGN_NM;
}