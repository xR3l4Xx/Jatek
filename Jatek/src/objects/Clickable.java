package objects;

import math.Vector2;

public abstract class Clickable {
	private double x, y, width, height;
	private boolean attached;
	private Vector2 focus;
	
	public Clickable(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		attached = false;
	}
	
	public Clickable(Vector2 focus, double width, double height) {
		attached = true;
		this.focus = focus;
		this.width = width;
		this.height = height;
	}
	
	public void attach(Vector2 vector) {
		attached = true;
		focus = vector;
	}
	
	abstract void click();
	
	// Ez azert boolean, mert ha akarunk sorrend alapjan olyat, hogy megszakitsa a korbekerdezest,
	//   akkor ezzel lehet szorakázni
	public boolean checkClick(double x, double y) {
		if(!attached) {
			if(x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height) {
				this.click();
				return true;
			}
		}
		
		double dx = focus.getX() - x;
		double dy = focus.getY() - y;
		
		if(Math.abs(dx) <= width / 2 && Math.abs(dy) <= height / 2) {
			this.click();
			return true;
		}
		
		return false;
	}
}
