package com.society.mangement.swaggerui;

import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SocietySwaggerConfig {
	
	public Docket registerUserApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("com.society.mangement.controller"))
				.paths(RegexpURLValidator("/societyinformation.*")).build();		
		
		
	}

	private Predicate<String> RegexpURLValidator(String string) {
		Predicate<String> containsLetterA = p -> p.equals("/societyinformation.*");
		return containsLetterA;
	}

}
