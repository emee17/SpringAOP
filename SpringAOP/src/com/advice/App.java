package com.advice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class App {

	public static void main(String[] args)
	{
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfigurationXML.class);
		
		AOPBean aopbean = context.getBean(AOPBean.class);
		
		aopbean.show();
	}

}
