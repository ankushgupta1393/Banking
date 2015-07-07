import java.util.Scanner;


public class Admin extends Bank{
	Scanner in = new Scanner(System.in);
	Admin(){
		System.out.print("What action you  want to perform \n 1. Sort by name \n 2. Sort by balance \n 3. Search via Account number");
		int ch = in.nextInt();
		char op='y';
		do{
			switch(ch){
			case 1: ByName byname = new ByName();
					break;
					
			case 2: ByBal bybal = new ByBal();
					break;
				
			case 3: Searching srch = new Searching();
					break;
			default : System.out.println("Please enter a valid choice\n");
			
		}
			System.out.println("Wish to continue?(y/n)");
			 op = in.next().charAt(0);
		}while(op!='n');

}
}
