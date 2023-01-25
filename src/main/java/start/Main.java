package main.java.start;

import main.java.control.PaintViewerContoller;

public class Main {
		
	public static void main(String[] args) {
		
		PaintViewerContoller Start = new PaintViewerContoller(args[0]);
		Start.startLoop();
	}
}
