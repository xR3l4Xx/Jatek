package objects;

import java.util.ArrayList;

public class ClickableHandler {
	ArrayList<Clickable> clickables;
	
	public ClickableHandler() {
		clickables = new ArrayList<Clickable>();
	}
	
	public void checkClick(double x, double y) {
		for(Clickable c : clickables) {
			c.checkClick(x, y);
		}
	}
}
