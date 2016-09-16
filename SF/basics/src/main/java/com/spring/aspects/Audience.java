package com.spring.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

	@Pointcut("execution(* com.spring.aspects.Performance.perform(..)) && args(populationSize)")
	public void stageshow(long populationSize) {}
	
	@Before("stageshow(populationSize)")
	public void silentCellPhones(long populationSize){
		System.out.println("Switch off/silent your cell phones");
	}
	
	@Before("stageshow(populationSize)")
	public void takeSeats(long populationSize){
		System.out.println("Please take your seats");
		System.out.println("No of people attending stage show : "+populationSize);
	}
	
	@AfterReturning("stageshow(populationSize)")
	public void applause(long populationSize){
		System.out.println("Clap Clap Clap");
	}
	
	@AfterThrowing("stageshow(populationSize)")
	public void demandRefund(long populationSize){
		System.out.println("Demanding refund");
	}
	
	@After("stageshow(populationSize)")
	public void goHome(long populationSize){
		System.out.println("Going home");
	}
	
}
