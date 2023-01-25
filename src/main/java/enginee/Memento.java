package main.java.enginee;

/**
 * Encapsulates the snapshots
 * 
 * @author David R Jackson
 *
 */
public class Memento {

	private Command oldCommand;

	public Memento(String[] commandCopy){
		
		oldCommand = new Command();
		oldCommand.setCommand(commandCopy);
	}

	public Command getState(){
		
		return this.oldCommand;
	}	
}
