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
public class NewsTb extends BaseTb {

	private Integer newsId;
	private String pub;
	private String title;
	private String reporter;
	private String url;
	private LocalDateTime pubDt;
}