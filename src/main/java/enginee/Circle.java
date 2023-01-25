package main.java.enginee;

/**
 * Stores information for Circle
 * 
 * @author David R Jackson
 *
 */
public class Circle extends Shape{

	private int radius;
		
	public Circle (String[] command) {
		super();
		shapeName = "Circle";
		radius = Integer.parseInt(command[2]);
		this.color.setColor("Blue");
	}
			
    public String toString() {
   
        return this.shapeName + ", Color: " + this.color.toString() + ", Origin: (" +
        		this.postion.toString() + "), Radius:" + this.radius;
    }
    
    public int getRadius() {
    	return this.radius;
    }
}
