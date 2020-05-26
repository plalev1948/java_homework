package marvelous_misadventures;

import java.io.BufferedReader; //Scanner
import java.io.FileReader;
import java.util.Scanner;


public class Battlefield {
		public static final String Entrance = "S";
		public static final String Exit = "F";
		public static final String Hidden_Squares_that_include_unknwon = "X";
		public static final String Already_Clicked_Square = "V";
		public static final String Current_Position_Of_Battale_Station = "*";
		public static final String Final_Destination = "F";
		

		public static int movesCounter = 0;
		

	//Reads a text file and outputs and counts the number of integers
	//read from the file 
	public static void main(String[] args) throws Exception 
		{
		//Scanner read = new Scanner(System.in)
		FileReader file = new FileReader("C:/Users/User/Desktop/ПУ онлайн обучение/Week 8/marvelous_misadventures/src/marvelous_misadventures.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();
		while(line != null)
			{
			text +=line;
			line=reader.readLine();
			}
		
		
			System.out.println(text);
			
	}
}



