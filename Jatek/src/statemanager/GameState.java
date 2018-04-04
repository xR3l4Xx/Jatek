package statemanager;

import java.awt.Graphics2D;

public abstract class GameState {
	// Referencia a "main-ben" a gamestate objektumra, aminek 
	//   hivogatjuk az alabbi fuggvenyeit
	static GameState mainstate;
	
	public abstract void update(double delta);
	public abstract void draw(Graphics2D g);
	// Be kell allitani a mainstate referenciat, hogy state 
	//   valtaskor elerjuk
	public abstract void init(GameState gamestate);
	public abstract void cleanup();
}
