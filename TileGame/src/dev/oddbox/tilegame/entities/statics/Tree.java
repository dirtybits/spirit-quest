package dev.oddbox.tilegame.entities.statics;

import java.awt.Graphics;

import dev.oddbox.tilegame.Handler;
import dev.oddbox.tilegame.gfx.Assets;
import dev.oddbox.tilegame.tiles.Tile;

public class Tree extends StaticEntity {

	public Tree(Handler handler, float x, float y){
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.x = 10;
		bounds.y = (int)(height/1.5f);
		bounds.width = width - 20;
		bounds.height = (int) (height - height / 1.5f);
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Assets.tree, (int) 
				(x - handler.getGameCamera().getxOffset()), 
				(int) (y- handler.getGameCamera().getyOffset()), width, height, null);
	}
}
