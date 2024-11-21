package com.dr_plant.project.util;

import jakarta.servlet.http.Cookie;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil {

	public CommonUtil() {
		// 기본 생성자
	}

	public Cookie setCookie(String key, String value) {
		Cookie cookie = new Cookie(key, value);
		cookie.setMaxAge(1 * 60 * 60); // 1시간 동안 유지
		cookie.setPath("/kakao"); // 쿠키의 유효 경로
		cookie.setHttpOnly(false); // 클라이언트 자바스크립트에서 접근 가능하도록 설정
		return cookie;
	}
}
