package Coursework;
import java.util.Scanner;

public class Payments {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select the years of experience");
			System.out.println("\n"
					+ "1. 1 - 2\n"
					+ "2. 3 - 4\n"
					+ "3. 5 - 6\n"
					+ "4. 7 - 8\n"
					+ "5. 9 - 10\n"
					+ "6. 11 - above\n");
			int option = sc.nextInt();
			
			switch(option) {
			case 1: System.out.println("Your payment is " + "UGX. 1000000" ); break;
			case 2: System.out.println("Your payment is" + "UGX. 1500000" ); break;
			case 3: System.out.println("Your payment is" + "UGX. 2000000" ); break;
			case 4: System.out.println("Your payment is" + "UGX. 2500000" ); break;
			case 5: System.out.println("Your payment is" + "UGX. 3000000" ); break;
			case 6: System.out.println("Your payment is" + "UGX. 4000000" ); break;
			default: System.out.println("Invalid input"); break;
			}
			
		}
		
		System.out.println("You are out of chances");
		
		

	}

}
