import java.util.Date;
import java.util.Scanner;



public class BankAccount extends Bank {
	Date date = new Date();
	String AccHolderName;
	String AccType;
	double balance;
	int AccNo;
	Scanner input = new Scanner(System.in);
	/*public BankAccount(String name,String typ,double bal,int num)
	{
		this.AccHolderName = name;
		this.AccType = typ;
		this.balance = bal;
		this.AccNo = num;
	}*/
	
	// there must change void to String,and different methods...for example:in methods getBalance
	  
	public String getname(){
		System.out.println("Enter Account holder name");
		String name=input.nextLine();
		setname(name);
		return this.AccHolderName;
		
				}
	public void getAccNo(){
		System.out.println("Enter Account number");
		int number=input.nextInt();
		
		
		
	}
	void getAccountType(){
		System.out.println("Enter Account holder type");
		String name=input.nextLine();
		setname(name);
	
	}
	
	void getbalance(){
		System.out.println("Set initial balance");
		double bal = input.nextDouble();
		setbalance(bal);
	}
	
	void setbalance(double balanc){
		balance = balanc;
	}
	void setname(String name){
			AccHolderName = name;
			System.out.println("Account holder name = " + AccHolderName );
	}
	void setAccNo(int number){
		AccNo = number;
		
	}
	void setAccountType(String type){
		AccType=type;
}
void display()
{System.out.println("Congratulations your account has been successfully created\n Your account no. is "+AccNo+"\n Account holder name is "+AccHolderName+"\n Current balance is "+balance + "\n Date of Creation " +date);
}
}



