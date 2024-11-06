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

	private Integer NEWS_ID;
	private String PUB;
	private String TITLE;
	private String REPORTER;
	private String URL;
	private LocalDateTime PUB_DT;
	private String imageUrl;
}