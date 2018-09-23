package com.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper 
{
	
	
	@After("execution(public void show())")
	public void log()
	{
		System.out.println("SubhanAllah it also Works");
	}
}
