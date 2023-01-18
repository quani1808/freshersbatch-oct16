package com.gl.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZuulProxy
public class ApigatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayserverApplication.class, args);
	}

}
