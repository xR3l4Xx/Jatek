package objects;

import math.Vector2;

public class Player {
	Vector2 position;
	
	public Player(){
		position = new Vector2(0,0);
	}
	public Player(int x, int y){
		position = new Vector2(x, y);
	}
	public Player(Vector2 pos){
		this.position = new Vector2(pos);
	}

}
