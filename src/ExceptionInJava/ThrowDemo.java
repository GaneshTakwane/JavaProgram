package ExceptionInJava;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a= new Account();
		a.withdraw(100000);

	}

}

class Account{
	int balance=30000;
	
	void withdraw(int amount)  {
		if(balance>amount) {
			balance=balance-amount;
			System.out.println("balance="+balance);
		}
		else {
			 System.out.println("balance="+balance);
			 throw new MyException("your account balance is low plz try diffrent amount");
			 
			//throw new MyException("your account balance is low plz try diffrent amount");
			
		}
		
	}
	
}




