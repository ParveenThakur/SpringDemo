package com.spring.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class CdConfig {

	@Bean
	public CompactDisc bettlesCD(){
		return new BettlesCD(System.out);
	}
}
