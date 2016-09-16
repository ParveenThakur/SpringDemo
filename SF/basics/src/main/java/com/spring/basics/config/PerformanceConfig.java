package com.spring.basics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.spring.aspects.Audience;
import com.spring.aspects.Performance;
import com.spring.aspects.PerformanceInterface;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.spring.aspects")
public class PerformanceConfig {

}
