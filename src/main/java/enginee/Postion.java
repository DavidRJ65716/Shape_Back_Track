package main.java.enginee;

/**
 * Stores and controls positions
 * 
 * @author David R Jackson
 *
 */
public class Postion {
	
	private int xPostion;
	private int yPostion;
	
	public Postion() {
		
		this.xPostion = 0;
		this.yPostion = 0;
	}
		
	public void updateMove(String[] command, Memento stateSnapShot) {
		stateSnapShot.getState().setOldXpotion(this.xPostion);
		stateSnapShot.getState().setOnlYpostion(this.yPostion);
		this.xPostion = Integer.parseInt(command[1]);
		this.yPostion = Integer.parseInt(command[2]);
	}
		
	public String toString() {
        
		return xPostion + "," +  yPostion;
    }
	
	public void setXPostion(int x) {
		this.xPostion = x;
	}
	
	public void setYPostion(int y) {
		this.yPostion = y;
	}
}
