package com.dr_plant.project.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

@EqualsAndHashCode(callSuper=true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExtrmnCmpTb extends BaseTb {

	@JsonProperty("CMP_ID")
    private Integer CMP_ID;

    @JsonProperty("CMP_NM")
    private String CMP_NM;

    @JsonProperty("FULL_ADDR")
    private String FULL_ADDR;

    @JsonProperty("ADDR")
    private String ADDR;

    @JsonProperty("ADDR_DET")
    private String ADDR_DET;

    @JsonProperty("BIZ_DIV")
    private String BIZ_DIV;

    @JsonProperty("CONT")
    private String CONT;

    @JsonProperty("REMARKS")
    private String REMARKS;

    @JsonProperty("RGN_ID")
    private String RGN_ID;
}