package objects;

import java.awt.Graphics;

public class Kuki {

	int x, y;
	
	public Kuki(){
		x = 0;
		y = 0;
	}
	
	public void render(Graphics g){
		g.fillOval(x-10, y-10, 20, 20);
		g.fillOval(x+10, y-10, 20, 20);
		g.fillRect(x-10, y+100, 20, 110);
		g.fillOval(x-10, y+100, 20, 20);
	}
}
