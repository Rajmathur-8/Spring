package com.spring.learnspringframework.examples.h1;



import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.GamingConsole;


public class XmlConfigurationContextLauncherApplication2 {


	public static void main(String[] args) {
		
		try(var context = 
				new ClassPathXmlApplicationContext(contextConfiguration.xml))
				{
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		};
			
	}

}
