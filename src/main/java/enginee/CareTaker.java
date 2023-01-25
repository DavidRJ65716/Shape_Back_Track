package main.java.enginee;
	
import java.util.LinkedList;
/**
 * Stores the snapshots of state
 * 
 * @author David R Jackson
 *
 */
public class CareTaker {
	   
	private LinkedList<Memento> mementoList = new LinkedList<Memento>();

	   
	public void addSnapShot(Memento state){
		
		mementoList.push(state);
	}

	public Memento getSnapShot(){
		
		return mementoList.pop();
	}
}

