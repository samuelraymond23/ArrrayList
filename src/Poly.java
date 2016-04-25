import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Poly {
	ArrayList<String> List1;
	Poly(){
		//initialized array list
				ArrayList<String> List1 = new ArrayList<String>();
	}
	//Creates a Scanner variable called s
	public Scanner s;

	public void readfile(){
		
		try{
			
			Scanner s = new Scanner(new File("C:\\Users\\samuel\\workspace\\Array List\\ARRAY\\src\\NumsFile.txt"));
			
			while(s.hasNextLine()){
				
			String a = s.nextLine(); //Saves the first word in the file as a
			String[] parts = a.split(",");
			for(int i = 0; i < parts.length; i++){
				if(i % 2 == 0){
					int x = Integer.valueOf(parts[i]);
					int y = Integer.valueOf(parts[i + 1]);
					TermClass TermClassObject = new TermClass(x, y);
					List1.add(TermClassObject.toString());
		
			}
			for(int r = 0 ; r < List1.size(); r++){
				System.out.println(List1.get(r));
			}
			}
			
			}
			s.close();
		}
	
			
		//If file not found prints no file found
		catch(Exception e){
			System.out.println("no file found");
		}
		//Iterates through the whole text file
		
	}
}
	