package math;

public class Vector2 {
	private double x, y;
	
	public Vector2(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector2(Vector2 vector){
		this.x = vector.getX();
		this.y = vector.getY();
	}
	
	public double length() {
		return Math.sqrt(x*x + y*y);
	}
	
	public void normalize() {
		double len = this.length();
		this.x /= len;
		this.y /= len;
	}
	
	public Vector2 normalized() {
		Vector2 ret = new Vector2(this);
		ret.normalize();
		return ret;
	}
	
	public void add(Vector2 vector) {
		this.x += vector.getX();
		this.y += vector.getY();
	}
	
	public Vector2 added(Vector2 vector) {
		return new Vector2(this.x + vector.getX(), this.y + vector.getY());
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}
