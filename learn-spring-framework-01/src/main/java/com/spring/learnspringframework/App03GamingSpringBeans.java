package com.spring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.GamingConsole;
import com.spring.learnspringframework.game.MarioGame;
import com.spring.learnspringframework.game.PacmanGame;
import com.spring.learnspringframework.game.SuperContra;
import com.spring.learnspringframework.helloWorld.HelloWorldConfiguration;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(GamingConfiguation.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		};
		
		
		
	}

}
