package main.java.enginee;

/**
 * Undoes the last command
 * 
 * @author David R Jackson
 *
 */
public class Undo {
		
	public void proccessCommand(Memento stateSnapShot, State state) {
		
		switch(stateSnapShot.getState().getCommand()[0]) {
			case "CREATE":
				removeCreate(stateSnapShot, state);
				break;
			case "SELECT":
				restoreSelectedShape(stateSnapShot, state);
				break;
			case "DELETE":
				restoreDeletedShape(stateSnapShot, state);
				break;
			case "COLOR":
				restoreColor(stateSnapShot, state);
				break;
			case "MOVE":
				restoreMove(stateSnapShot, state);
				break;
		}
	}
	
	private void restoreMove(Memento stateSnapShot, State state) {
		
		state.getdrawList().get(stateSnapShot.getState().getPrevShapeSelected()).setLastPotion(
				stateSnapShot.getState().getOldXpotion(), 
				stateSnapShot.getState().getOnlYpostion());
	}
	
	private void restoreColor(Memento stateSnapShot, State state) {
		
		state.getdrawList().get(stateSnapShot.getState().getPrevShapeSelected()).restoreColor(
				stateSnapShot.getState().getColor());
	}
	
	private void restoreDeletedShape(Memento stateSnapShot, State state) {
		
		state.getdrawList().add(stateSnapShot.getState().getPrevShapeSelected(), 
				stateSnapShot.getState().getDeletedshape());
	}
	
	private void restoreSelectedShape(Memento stateSnapShot, State state) {
		
		state.setSelectedShape(stateSnapShot.getState().getPrevShapeSelected());
	}
	
	private void removeCreate(Memento stateSnapShot, State state) {
		
		state.getdrawList().remove(stateSnapShot.getState().getPrevShapeSelected());
	}
}
