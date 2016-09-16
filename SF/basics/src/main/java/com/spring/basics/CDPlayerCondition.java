package com.spring.basics;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CDPlayerCondition implements Condition{

	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		return arg0.getEnvironment().containsProperty("manish");
	}

}
