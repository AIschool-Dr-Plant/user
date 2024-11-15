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

    private Integer CMP_ID;
    private String CMP_NM;
    private String FULL_ADDR;
    private String ADDR;
    private String ADDR_DET;
    private String BIZ_DIV;
    private String CONT;
    private String REMARKS;
    private String RGN_ID;
}