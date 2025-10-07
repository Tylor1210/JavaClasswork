package classwork6;
import java.util.Scanner;

public class Classwork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] accNums = {10001, 20002, 30003, 40004, 50005, 60006, 70007};
		int userAcc = 0;
		
		Scanner scannerObj = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		userAcc = scannerObj.nextInt();
		
		for(int i = 0; i < 7; i++) {
			if (userAcc == accNums[i]) {
				System.out.println("Valid Account Number");
				break;
			}else{
				System.out.println("Invalid Account Number");
				break;
			}
		}
		scannerObj.close();
	}

}
