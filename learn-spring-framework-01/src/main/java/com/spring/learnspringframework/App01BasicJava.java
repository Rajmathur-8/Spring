package com.spring.learnspringframework;

import com.spring.learnspringframework.game.GameRunner;
import com.spring.learnspringframework.game.MarioGame;
import com.spring.learnspringframework.game.PacmanGame;
import com.spring.learnspringframework.game.SuperContra;

public class App01BasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContra();
		var game = new PacmanGame();//1: Object Creation
		var gameRunner = new GameRunner(game);
		//2: Object Creation + Wiring of Dependencies
		// Game is a dependency of GameRunner
		
		gameRunner.run();
	}

}
