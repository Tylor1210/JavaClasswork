package menuEx2;
import java.util.Scanner;

public class MenuEx2 {
	//Global scanner
	public static Scanner scannerObj = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		String word = "";
		while (flag) {
				//CallHeader 
				PrintHeader();
				int choice = GetUserChoice();
				switch(choice) {
				case 1:
					word = GetUserString();
					break;
				case 2:
					System.out.println(word.length());
					break;
				case 3:
					System.out.println(word.toUpperCase());
					break;
				case 4:
					break;
				default:
					System.out.println("Invalid choice (1-4)");
				}
				System.out.println("Do you want to continue? (Y/N): ");
				String again = scannerObj.nextLine();
				if(again.toLowerCase().equals("y")) {
					flag = true;
				}else {
					System.out.println("GoodBye!");
					flag = false;
				}
		
			}	

	}
	
	
	//Create a Header Method/Function
		public static void PrintHeader()
		{
			System.out.println("**************************************");
			System.out.println("**** 1. Get User input ***************");
			System.out.println("**** 2. Print String Length **********");
			System.out.println("**** 3. Print String in uppercase ****");
			System.out.println("**** 4. Exit *************************");
			System.out.println("**************************************");
		}
		public static int GetUserChoice()
		{
			System.out.println("Your choice: ");
			int userChoice = scannerObj.nextInt();
			scannerObj.nextLine();

			return userChoice;
		}
		public static String GetUserString()
		{
			System.out.println("Your string: ");
			String userString = scannerObj.nextLine();

			return userString;
		}

}
