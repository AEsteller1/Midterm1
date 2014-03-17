import java.util.*;
import javax.swing.*;
import java.io.*;

public class MainClass {
	
	private final static int fieldNo = 4;
	
	public static void main (String args[]){
		ArrayList<Show> TVlist = new ArrayList<Show>();
		String fileName = "TVGuide.txt";
		String currentLine;
		String[] movieFields = new String[fieldNo];
		try {
			Scanner scan = new Scanner(new FileInputStream(fileName));
			
			while (  scan.hasNextLine() ){
				currentLine = scan.nextLine();
				movieFields = currentLine.split("\t");
				System.out.println(movieFields[1]);
				// change below
				Show s = new Show(movieFields[0], movieFields[1], movieFields[2], movieFields[3]);
				TVlist.add(s);
			} 
			
			System.out.println(TVlist.size());
			scan.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String input = JOptionPane.showInputDialog("Please enter a show name");
		boolean matchFound = false;
		
		for (int i = 0; i < TVlist.size(); i++){
			if( input.equalsIgnoreCase( TVlist.get(i).getName())){
				//JOptionPane.showMessageDialog(null, "The show " + input + " was found");
				JOptionPane.showMessageDialog(null, TVlist.get(i).toString());
				matchFound = true;
				break;
				
			
			}
			
			
			
				
		}
		
	if (matchFound == false){
		
		JOptionPane.showMessageDialog(null, "The show " + input + " was not found");
	}
		
	
	
		
		
	}
	
	

}
