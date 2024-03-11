package com.spring.learnspringframework.examples.c1;



import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.GamingConsole;


@Configuration
@ComponentScan
public class RealWorldExampleSpringContextLauncherApplication2 {


	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(RealWorldExampleSpringContextLauncherApplication2.class)){
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		
			System.out.println(
					context.getBean(BusinessCalculationService.class)
					.findMax());
		}
	}

}
