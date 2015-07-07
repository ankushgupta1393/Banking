import java.util.Comparator;


public  class ByName implements Comparator<BankAccount>{

	@Override
	public int compare(BankAccount e1, BankAccount e2) {
		if(e1.getName() < e2.getName()){
			            return 1;
			        } else {
			            return -1;
			        }
		return 0;
	}
	

}
