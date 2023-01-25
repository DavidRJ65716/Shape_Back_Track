package main.java.control;

import java.util.ArrayList;

import main.java.enginee.CareTaker;
import main.java.enginee.Command;
import main.java.enginee.Memento;
import main.java.enginee.ProcessFile;
import main.java.enginee.State;
import main.java.enginee.Undo;
/**
 * Processes commands and passes information
 * 
 * @author David R Jackson
 *
 */
public class PaintViewerContoller {
	
	private  ArrayList<String[]> commandList;
	private CareTaker careTaker;
	private State state;
	private Undo undo;
	
	public PaintViewerContoller(String File) {
		
		commandList = new ArrayList<String[]>();
		state = new State();
		ProcessFile ProcessFile = new ProcessFile(File);
		ProcessFile.startProcessing(commandList);
		careTaker = new CareTaker();
		undo = new Undo();
	}
	
	public void startLoop() {
		
		for(String[] currentCommand : commandList) {
			
			switch(currentCommand[0]) {
				case "UNDO":
					undo.proccessCommand(careTaker.getSnapShot(), state);
					break;
				case "DRAWSCENE":
					Memento stateSnapShot = snapShot(currentCommand);
					System.out.print(state.drawSceen());
					careTaker.addSnapShot(stateSnapShot);
					break;
				case "DRAW":
					Memento stateSnapShot1 = snapShot(currentCommand);
					System.out.print(state.drawShape());
					careTaker.addSnapShot(stateSnapShot1);
					break;
				default :
					Memento stateSnapShot2 = snapShot(currentCommand);
					if(state.processCommand(currentCommand, stateSnapShot2)) {
						careTaker.addSnapShot(stateSnapShot2);
					}
			}
		}
	}
	
	public Memento snapShot(String[] commandCopy){
		
		return new Memento(commandCopy);
	}
	
	public Command getLastCommand(Memento memento){
		
		return memento.getState();
	}
}
 