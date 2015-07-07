import java.io.Serializable;
import java.util.Scanner;



public class Transaction extends BankAccount implements Serializable {
			//BankAccount bankacc = new BankAccount();
	//Transac t = new Transac();
	int userChoice,numb;
    char c;
    int flag = 0;
    double balance = 0;  
    Scanner in = new Scanner(System.in);
	
            		public void function(){
            			
            	System.out.println("Enter Account number");
        		numb=in.nextInt();
        		System.out.println("hello");
        		
        		for(int i = 0;i <= nameList.size(); i++) {
        			System.out.println("hello1");
        			BankAccount b=null;
            			try{
            				if(nameList.get(i).AccNo ==  numb) {
            					b=nameList.get(i);
            					operations(b);
            				
            				
            			}
            			
            			else{
                			System.out.println("Invalid Credentials");
                		}
            			
            			
            			}
            			catch (Exception e){
            				System.out.println("Exception");
      
            			}
        				
            			
        		}
				
            				
            
        			
}

					private void operations(BankAccount b) {
						char ch;
						do{
							
					System.out.println("1. Deposit money");
				    System.out.println("2. Withdraw money");
				    System.out.println("3. Check balance");
				    System.out.print("Enter your choice, 0 to quit: ");
				    userChoice = in.nextInt();
				    switch (userChoice) {
				    case 1:
				          float amount;
				        
				          System.out.print("Amount to deposit: ");
				          amount = in.nextFloat();
				          if (amount <= 0)
				               System.out.println("Can't deposit nonpositive amount.");
				          else {
				               b.balance += amount;
				               System.out.println("$" + amount + " has been deposited.");
				          }
				          break;
				    case 2:
				          System.out.print("Amount to withdraw: ");
				          amount = in.nextFloat();
				          if (amount <= 0 || amount > b.balance)
				               System.out.println("Withdrawal can't be completed.");
				          else {
				               b.balance -= amount;
				               System.out.println("$" + amount + " has been withdrawn.");
				          }
				          break;
				    case 3:
				          System.out.println("Your balance: $" + b.balance);
				          break;
				    case 0:
				  	  
				          flag=1;
				          break;
				    default:
				          System.out.println("Wrong choice.");
				          break;
				    }
				    System.out.println("Do you want to continue? (Y/N)");
				     ch = in.next().charAt(0);
				    }while (ch != 'N');

					}

						
					}
