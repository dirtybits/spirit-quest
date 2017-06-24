package dev.oddbox.tilegame.states;

import java.awt.Graphics;

import dev.oddbox.tilegame.Game;
import dev.oddbox.tilegame.Handler;
import dev.oddbox.tilegame.entities.creatures.Player;
import dev.oddbox.tilegame.entities.statics.Tree;
import dev.oddbox.tilegame.tiles.Tile;
import dev.oddbox.tilegame.worlds.World;


public class GameState extends State {

	private World world;

	
	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "res/worlds/world1.txt");
		handler.setWorld(world);
		
		
	}
	
	@Override
	public void tick() {
		world.tick();
		
		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		
	}
	
	

	
}
