package com.dr_plant.project.entity;


import java.time.LocalDateTime;

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
public class TemPestTb extends BaseTb {

	private String RGN_ID;
	private LocalDateTime regDt;
    private Integer 검은무늬병;
    private Integer 검은별무늬병;
    private Integer 겹무늬병;
    private Integer 과수화상병;
    private Integer 그을음병;
    private Integer 근두암종병;
    private Integer 뒷면흰가루병;
    private Integer 배갈색썩음병;
    private Integer 붉은가지마름병;
    private Integer 붉은별무늬병;
    private Integer 잎검은점병;
    private Integer 잿빛곰팡이병;
    private Integer 줄기마름병;
    private Integer 탄저병;
    private Integer 푸른곰팡이병;
    private Integer 흰가루병;
    private Integer 흰날개무늬병;
    private Integer 흰별무늬병;
    private Integer 가루깍지벌레;
    private Integer 갈색매미충;
    private Integer 꼬마배나무이;
    private Integer 노랑쐐기나방;
    private Integer 담배거세미나방;
    private Integer 말매미;
    private Integer 명주달팽이;
    private Integer 목화진딧물;
    private Integer 미국선녀벌레;
    private Integer 박쥐나방;
    private Integer 배나무둥글밑진딧물;
    private Integer 배나무면충;
    private Integer 배나무방패벌레;
    private Integer 배나무벌;
    private Integer 배나무이;
    private Integer 배명나방;
    private Integer 배혹벌;
    private Integer 복숭아심식나방;
    private Integer 사과알락나방;
    private Integer 에모무늬잎말이나방;
    private Integer 조팝나무진딧물;
    private Integer 차응애;
    private Integer 콩가루벌레;
    private Integer 긴털이리응애;
}