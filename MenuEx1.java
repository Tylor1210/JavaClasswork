package menuEx1;
import java.util.Scanner;


public class MenuEx1 {
	//Global scanner
	public static Scanner scannerObj = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		
		while (flag) {
		//CallHeader 
		PrintHeader();
		int userNo = GetUserInput();
		
		if(userNo == 9) {
			System.out.println("You Guessed It!");
		}else
		{
			System.out.println("Please Try another number!");
		}
		System.out.println("Do you want to continue?(Y/N)?: ");
		String option = scannerObj.nextLine();
		if(option.toLowerCase().equals("y"))
		{
			flag = true;
		}else {
			System.out.println("GoodBye! ");
			flag = false;
		}
	}
	}
	//Create a Header Method/Function
	public static void PrintHeader()
	{
		System.out.println("****************************");
		System.out.println("**** Guess the Number!! ****");
		System.out.println("****************************");
	}
	//Returns Integer back to user
	public static int GetUserInput()
	{
		System.out.println("Your guess: ");
		int userNumber = scannerObj.nextInt();
		scannerObj.nextLine();
		return userNumber;
	}

}
