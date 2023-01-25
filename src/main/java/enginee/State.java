package main.java.enginee;

import java.util.ArrayList;

/**
 * Stores and control states
 * Passes information
 * 
 * @author David R Jackson
 *
 */
public class State {
	
	private ArrayList<Shape> drawList;
	private int selectedShape;
	private static int drawListLimit = 0;
	
	public State() {
		
		selectedShape = -1;
		drawList = new ArrayList<Shape>();
	}
		
	public boolean processCommand(String[] currnetCommand, Memento stateSnapShot) {
		
		switch(currnetCommand[0]) {
			case "SELECT":
				int shapeToSelecte = Integer.parseInt(currnetCommand[1]) - 1;
				if(drawList.size() > shapeToSelecte && shapeToSelecte >= drawListLimit) {
					stateSnapShot.getState().setPrevShapeSelected(selectedShape);
					selectedShape = shapeToSelecte;
				} else {
					System.out.println("ERROR: invalid shape for SELECT");
					return false;
				}
				break;
			case "CREATE":
				Shape shape = null;
				switch(currnetCommand[1]){
					case "RECTANGLE":
						shape = new Rectangle(currnetCommand);
						stateSnapShot.getState().setCreatedShape(drawList.size());
						break;
					case "CIRCLE":
						shape = new Circle(currnetCommand);
						stateSnapShot.getState().setCreatedShape(drawList.size());
						break;
				}			
				drawList.add(shape);
				break;
			case "DELETE":
				if (drawList.size() > selectedShape && selectedShape >= drawListLimit) {
					stateSnapShot.getState().setPrevShapeSelected(selectedShape);
					stateSnapShot.getState().setDeletedshape(drawList.remove(selectedShape));
					selectedShape = -1;
				} else {
					System.out.println("No shape selected");
					return false;
				}
				break;
			default:
				if (drawList.size() > selectedShape && selectedShape >= drawListLimit) {
					stateSnapShot.getState().setPrevShapeSelected(selectedShape);
					drawList.get(selectedShape).processCommand(currnetCommand, stateSnapShot);
				} else {
					System.out.println("No shape selected");
					return false;
				}
		}
		return true;
	}
		
    public String drawSceen() {
    	
    	String shapeToPrint = "";
    	
    	for(Shape shape: drawList) {
    		
    		shapeToPrint += shape.toString() + "\n";    		
    	}
    	
        return shapeToPrint;
    }
    	
	public String drawShape() {
		if (selectedShape < 0) {
			return "No shape selected";
		}
		return drawList.get(selectedShape).toString() + "\n";
	}
	
	public void setSelectedShape(int newSelectedShape) {
		this.selectedShape = newSelectedShape;
	}
	
	public int getSelectedShape() {
		return this.selectedShape;
	}
	
	public ArrayList<Shape> getdrawList(){
		return drawList;
	}
}

