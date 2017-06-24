package dev.oddbox.tilegame.tiles;

import dev.oddbox.tilegame.gfx.Assets;

public class WaterTile extends Tile	{

	public WaterTile(int id) {
		super(Assets.water, id);
	}
	public boolean isSolid(){
		return true;
	}

}
