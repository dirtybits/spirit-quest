package dev.oddbox.tilegame.entities.statics;

import dev.oddbox.tilegame.Handler;
import dev.oddbox.tilegame.entities.Entity;

public abstract class StaticEntity extends Entity {

	public StaticEntity(Handler handler, float x, float y, int width, int height){
		super(handler,x,y,width,height);
	}
}
