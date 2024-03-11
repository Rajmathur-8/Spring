package com.spring.learnspringframework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.MarioGame;
import com.spring.learnspringframework.game.PacmanGame;
import com.spring.learnspringframework.game.SuperContra;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		// 1: Launch a spring Context
		
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class)){
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean("person5Qualifier"));
		}
		
		
		// 2: Configure the things that we want spring to manage
		//HelloWorldConfiguration-@Configuration 
		// name -@Bean
		
		// 3: Retrieving Beans managed by Spring
			
			

//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);;
	}

}
