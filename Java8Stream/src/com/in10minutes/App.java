package com.in10minutes;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//This is your Editor pane. Write your Java here and 
//use the command line to execute commands
@Repeatable(Games.class)
@interface Game {
	String name();

	String day();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Games {
	Game[] value();
}

@Game(name = "Cricket", day = "Sunday")
@Game(name = "Hockey", day = "Friday")
@Game(name = "Football", day = "Saturday")
public class App {

	public static void main(String[] args) {

		Game[] game = App.class.getAnnotationsByType(Game.class);

		for (Game game1 : game) {
			System.out.println(game1.name() + " " + "on" + " " + game1.day());
		}
	}
}