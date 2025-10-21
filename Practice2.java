package practice2;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create file
		try {
			File fileObj = new File("c:\\temp\\movies.txt");
			if(fileObj.createNewFile())
			{
				System.out.println("File created.");
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch(IOException ex)
		{
			System.out.println("Error creating a file...");
		}
		
		int[] scores = new int[4];
		Scanner scannerObj = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("What is score " + (i+1) + "?: ");
			scores[i] = scannerObj.nextInt();
		}
		
		int total = (scores[0] + scores[1] + scores[2] + scores[3]);
		int average = (total / 4);
		
		
		//Write Data to the File
		try
		{
			FileWriter fw = new FileWriter("c:\\temp\\movies.txt");
			for(int i = 0; i < 4; i++) {
				fw.write("Score " + (i+1) + ": 		" + scores[i] +"\n");
			}
			fw.write("------------------------" + "\n");
			fw.write("Total: 			" + total + "\n");
			fw.write("Average: 		" + average);
			fw.close();
		}
		catch(IOException ex)
		{
			System.out.println("Error writing data into file.");
		}
		
		//Read data from the file 
		try
		{
			File fileObj = new File("c:\\temp\\movies.txt");
			Scanner reader = new Scanner(fileObj);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
		} catch(IOException ex)
		{
			System.out.println("Error reading data from file.");
		}
		
	}

}
