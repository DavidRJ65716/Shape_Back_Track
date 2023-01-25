package main.java.enginee;

import java.util.ArrayList;

/**
 * Stores Commands and snapshots old information
 * 
 * @author David R Jackson
 *
 */
public class Command {
	
	private String color;
	private int prevShapeSelected;
	private Shape Deletedshape;
	private int oldXpotion;
	private int onlYpostion;
	private String[] Command;
	private ArrayList<Shape> olddrawList;
	private int createdShape;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrevShapeSelected() {
		return prevShapeSelected;
	}
	public void setPrevShapeSelected(int prevShapeSelected) {
		this.prevShapeSelected = prevShapeSelected;
	}
	public Shape getDeletedshape() {
		return Deletedshape;
	}
	public void setDeletedshape(Shape deletedshape) {
		Deletedshape = deletedshape;
	}
	public int getOldXpotion() {
		return oldXpotion;
	}
	public void setOldXpotion(int oldXpotion) {
		this.oldXpotion = oldXpotion;
	}
	public int getOnlYpostion() {
		return onlYpostion;
	}
	public void setOnlYpostion(int onlYpostion) {
		this.onlYpostion = onlYpostion;
	}
	public String[] getCommand() {
		return Command;
	}
	public void setCommand(String[] command) {
		Command = command;
	}
	public ArrayList<Shape> getOlddrawList() {
		return olddrawList;
	}
	public void setOlddrawList(ArrayList<Shape> olddrawList) {
		this.olddrawList = olddrawList;
	}
	public int getCreatedShape() {
		return createdShape;
	}
	public void setCreatedShape(int createdShape) {
		this.createdShape = createdShape;
	}
}
