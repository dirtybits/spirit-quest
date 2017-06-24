package dev.oddbox.tilegame;

import dev.oddbox.tilegame.gfx.GameCamera;
import dev.oddbox.tilegame.input.KeyManager;
import dev.oddbox.tilegame.input.MouseManager;
import dev.oddbox.tilegame.worlds.World;

public class Handler {
	
	private Game game;
	private World world;

	public Handler(Game game){
		this.game = game;
	}
	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	public MouseManager getMouseManager(){
		return game.getMouseManager();
	}
	public int getWidth(){
		return game.getHeight();
		
	}
	public int getHeight(){
		return game.getHeight();
	}
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
	
}
