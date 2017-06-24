package dev.oddbox.tilegame.tiles;

import dev.oddbox.tilegame.gfx.Assets;

public class TreeTile extends Tile	{

	public TreeTile(int id) {
		super(Assets.tree, id);
	}
	public boolean isSolid(){
		return true;
	}

}
