package dev.oddbox.tilegame.tiles;

import dev.oddbox.tilegame.gfx.Assets;

public class RockTile extends Tile	{

	public RockTile(int id) {
		super(Assets.stone, id);
	}
	public boolean isSolid(){
		return true;
	}

}
