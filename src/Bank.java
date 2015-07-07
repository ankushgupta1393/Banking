import java.util.ArrayList;
import java.util.Scanner;


public class Bank  {
	
	public static ArrayList<BankAccount> nameList = new ArrayList<BankAccount>();
	
		
	public static void main(String[] args) {
		int choice;
		char c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to State Bank");
		do {
		System.out.println("Select your option");
		System.out.println("1.New user \n2.Existing User \n3.Admin \n4.Exit");
		choice = input.nextInt();
		
			switch(choice){
			case 1: 
					Manage Acc = new Manage();
				 	break;
			case 2: Transaction Tra = new Transaction();
					Tra.function();
					break;
			case 3: Admin Ad = new Admin();
					break;
			case 4: System.out.println("Thanks for the visit");
					System.exit(0);
			default: System.out.println("Invalid Choice");
					
			}
			System.out.println("Want to perform some other operation? (Y/N) ");
			c = input.next().charAt(0); 
			
	}while(c!='n');
		System.out.println("BYe");
	}
	
}

