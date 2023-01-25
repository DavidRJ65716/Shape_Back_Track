package main.java.enginee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Opens file and collects Commands
 * 
 * @author David R Jackson
 *
 */
public class ProcessFile {
	
	private Scanner data;
	private String file;
	
	public ProcessFile(String newfile){
		
		this.data = null;
		this.file = newfile;
	}
	
	public void startProcessing(ArrayList<String[]> commandList){
		
		try {
			data = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
			System.exit(0);
		}
		
		while(data.hasNextLine()) {
			
			String stringToClean = data.nextLine();
			stringToClean = stringToClean.replace("\n", "").replace("\r", "");
			String[] commands = stringToClean.split("\\s+");
			commandList.add(commands);
		}
		
		data.close();
	}
}
