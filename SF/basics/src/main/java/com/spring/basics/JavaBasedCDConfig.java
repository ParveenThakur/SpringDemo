package com.spring.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CdConfig.class)
public class JavaBasedCDConfig {

	@Bean
	@Conditional(CDPlayerCondition.class)
	public CDPlayer cdPlayer(CompactDisc bettlesCD){
		return new CDPlayer(bettlesCD);
	}
}
