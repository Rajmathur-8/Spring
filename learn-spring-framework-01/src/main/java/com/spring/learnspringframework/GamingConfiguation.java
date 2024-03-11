package com.spring.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.GamingConsole;
import com.spring.learnspringframework.game.PacmanGame;


@Configuration
public class GamingConfiguation {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	
	
}
