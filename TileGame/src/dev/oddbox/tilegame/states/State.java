package dev.oddbox.tilegame.states;

import java.awt.Graphics;

import dev.oddbox.tilegame.Game;
import dev.oddbox.tilegame.Handler;

public abstract class State {

	private static State currentState = null;
	
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	//Class
	
	protected Handler handler ;
	
	public State(Handler handler){
		this.handler = handler;
	}
	public abstract void tick();
	
	public abstract void render(Graphics g);


	
}
