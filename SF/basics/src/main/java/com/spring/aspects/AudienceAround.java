package com.spring.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AudienceAround {

	@Pointcut("execution(* com.spring.aspects.Performance.perform(long)) && args(noOfPeople)")
	public void perform(long noOfPeople){}
	
	@Around("perform(noOfPeople)")
	public void letsStart(ProceedingJoinPoint p,long noOfPeople) throws Throwable{
		try{
			System.out.println("please be sitted and switch off your phones");
			System.out.println("No. of people attending the live show : "+noOfPeople);
			p.proceed();
			System.out.println("Clap clap");
		}catch(Exception e){
			System.out.println("Demand refund");
		}
	}
}
