package com.dr_plant.project.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpToHttpsConfig {

	@Bean
	ServletWebServerFactory servletContainer() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
		tomcat.addAdditionalTomcatConnectors(createHttpConnector());
		return tomcat;
	}

	private Connector createHttpConnector() {
		Connector connector = new Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
		connector.setPort(8080); // HTTP 포트
		connector.setScheme("http");
		connector.setSecure(false);
		connector.setRedirectPort(8443); // HTTPS로 리다이렉트할 포트
		return connector;
	}
}