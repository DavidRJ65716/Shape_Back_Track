package main.java.enginee;

/**
 * Stores and controls color information
 * 
 * @author David R Jackson
 *
 */
public class Color {
		
	private String color;
	
	public Color() {
		
		this.color = "";
	}
	
	public void updateColor(String[] command, Memento stateSnapShot) {
		stateSnapShot.getState().setColor(this.color);
		this.color = command[1];
	}
		
	public String toString() {
        return this.color;
    }
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
}
