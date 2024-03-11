package com.spring.learnspringframework.examples.a0;



import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.GamingConsole;


@Configuration
@ComponentScan("com.spring.learnspringframework.examples.a1")
public class SimpleSpringContextLauncherApplication2 {


	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(SimpleSpringContextLauncherApplication2.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		};
			
	}

}
