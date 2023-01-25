package main.java.enginee;

/**
 * Stores and controls rectangle info
 * 
 * @author David R Jackson
 *
 */
public class Rectangle extends Shape{
	
	private int width;
	private int hight;
	
	public Rectangle (String[] command) {
		
		super();
		shapeName = "Rectangle";
		width = Integer.parseInt(command[2]);
		hight = Integer.parseInt(command[3]);
		this.color.setColor("Red");
		
	}

	public String toString() {
    	
        return this.shapeName + ", Color: " + this.color.toString() + ", Origin: (" +
    			this.postion.toString() + "), Width: " + this.width + ", Height: " + this.hight;
    }
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHight() {
		return this.hight;
	}
}
