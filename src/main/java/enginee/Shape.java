package main.java.enginee;

/**
 * Stores and controls shape info
 * 
 * @author David R Jackson
 *
 */
public class Shape {
	
	protected String shapeName;
	protected Color color;
	protected Postion postion;
		
	public Shape() {
		color = new Color();
		postion = new Postion();
	}
	
	public void processCommand(String[] command, Memento stateSnapShot) {
	
		switch(command[0]) {
			case "MOVE":
				this.postion.updateMove(command, stateSnapShot);
				break;
			case "COLOR":
				this.color.updateColor(command, stateSnapShot);
				break;
		}	
	}
		
	public void setLastPotion(int x, int y) {
		this.postion.setXPostion(x);
		this.postion.setYPostion(y);
	}
	
	public void restoreColor(String oldColor) {
		color.setColor(oldColor);
	}
}
