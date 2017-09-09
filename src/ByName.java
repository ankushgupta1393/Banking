import java.util.Comparator;


public  class ByName implements Comparator<BankAccount>{
     //from void method dont be compare....I changed type method from void to String....
	@Override
	public int compare(BankAccount e1, BankAccount e2) {
		if(e1.getName().length() < e2.getName().length()){
			            return 1;
			        } else {
			            return -1;
			        }
		return 0;
	}
	

}
