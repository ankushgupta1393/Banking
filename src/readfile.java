import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class readfile {

	public void read()
	{
try
{
		// read object from file
		FileInputStream fis = new FileInputStream("mybean.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//ArrayList<BankAccount> nameList = new ArrayList<BankAccount>();
		Bank.nameList = (ArrayList<BankAccount>) ois.readObject();
		ois.close();

		

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
	
	public void write(){
		try{
			// write object to file
						FileOutputStream fos = new FileOutputStream("mybean.ser");
						ObjectOutputStream oos = new ObjectOutputStream(fos);
					// ArrayList<BankAccount> nameList = new ArrayList<BankAccount>();
						oos.writeObject(Bank.nameList);
						oos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
