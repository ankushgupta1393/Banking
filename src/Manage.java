import java.io.Serializable;
import java.util.Scanner;


public class Manage extends  Bank implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	Manage() {
	CreateAccount();	
	}
	BankAccount bankacc = new BankAccount();
	
	Scanner input= new Scanner(System.in);
	String name;
	double balance;
	static int countcurrent=1000;	
	static int countsaving=2000;
	static int countbusiness=3000;
	

	public void CreateAccount()  {
		
		System.out.println("Select Type of Account you want to open\n1.Current Account\n2.Savings Account\n3.Business Account");
		int b = input.nextInt();
		switch(b){
		case 1: Current();
				break;
		case 2: Savings();
				break;
		case 3: Business();
				break;
		default : System.out.println("Invalid Choice");
		}
	}

	private void Business()  {
		
		countbusiness++;
		create(countbusiness);
		
	}

	

	private void Savings() {
		
		countsaving++;
		create(countsaving);
		
	}

	private void Current() {
		
		countcurrent++;
		create(countcurrent);
		
	}
	
	private void create(int accno) {
		
		bankacc.getname();
		bankacc.getbalance();
		bankacc.setAccNo(accno);
		nameList.add(bankacc);
		for(int i = 0; i < nameList.size(); i++){
            nameList.set(i, bankacc);
            nameList.get(i).display();
		
		
	}
	
	}
}


