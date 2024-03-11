package com.spring.learnspringframework.examples.f1;



import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.GamingConsole;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All Dependencies are ready");
	}
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("CleanUp");
	}
}
@Component
class SomeDependency{

	public void getReady() {
		System.out.println("Using some Dependency");
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication2 {


	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(PrePostAnnotationsContextLauncherApplication2.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		};
			
	}

}
