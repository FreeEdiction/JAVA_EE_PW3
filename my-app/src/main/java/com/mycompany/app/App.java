package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		
		System.out.println("byConstructor");
		Performer performer5 = (Performer)context.getBean("poeticDuke");
		performer5.perform();
		System.out.println("/byConstructor");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("byName");
		Instrumentalist performer4 = (Instrumentalist)context.getBean("robby");
		performer4.perform();
		System.out.println("/byName");
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("AutoWired");
		Instrumentalist performer6 = (Instrumentalist)context.getBean("kenny");
		performer6.perform();
		System.out.println("/AutoWired");
		
	}

}
