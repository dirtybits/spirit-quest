package dev.oddbox.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width=32,height=32;
	
	public static BufferedImage dirt,grass,stone,tree, water;
	//Player animation arrays
	public static BufferedImage[] player_down, player_up,
									player_left, player_right;
	
	public static void init(){
		SpriteSheet sheet = new 
				SpriteSheet(ImageLoader.loadImage
						("/textures/SpriteSheet.png"));
		
		player_down = new BufferedImage[3];
		player_up = new BufferedImage[3];
		player_left = new BufferedImage[3];
		player_right = new BufferedImage[3];
		
		
		
		int cx = 629;//player image crop x origin
		int cy = 4;  //player image crop y origin
		//Down
		player_down[0] = sheet.crop(cx, cy, width, height);
			player_down[1] = sheet.crop(cx + width, 4, width, height);
				player_down[2] = sheet.crop(cx + (width*2), 4, width, height);
					
		//Up
		player_up[0] = sheet.crop(cx, cy+(height*3), width, height);
			player_up[1] = sheet.crop(cx + width, 4+(height*3), width, height);
				player_up[2] = sheet.crop(cx + (width*2), 4+(height*3), width, height);
		//Left
		player_left[0] = sheet.crop(cx, cy+height, width, height);
			player_left[1] = sheet.crop(cx + width, 4+height, width, height);
				player_left[2] = sheet.crop(cx + (width*2), 4+height, width, height);
		//Right
		player_right[0] = sheet.crop(cx, cy+(height*2), width, height);
			player_right[1] = sheet.crop(cx + width, 4+(height*2), width, height);
				player_right[2] = sheet.crop(cx + (width*2), 4+(height*2), width, height);
				
		//Terrain tiles
		dirt = sheet.crop(99, 594, width, height);
		grass = sheet.crop(99, 627, width, height);
		stone = sheet.crop(231, 297, width, height);
		tree = sheet.crop(462, 198, width, height);
		water = sheet.crop(99, 528, width, height);
	}
	
	
}
