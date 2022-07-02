package InterfaceInjava;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		icici i= new icici();
		i.getROI();

	}

}

interface RBI{
	int minBalance=1000;
	void CheckBalance();
	void mobileBanking();
	void getROI();
	
}

class HDFC implements RBI{
   
	@Override
	public void CheckBalance() {
	
		// TODO Auto-generated method stub
		System.out.println("HDFC this is check balance method");
		
	}

	@Override
	public void mobileBanking() {
		// TODO Auto-generated method stub
		System.out.println("HDFC mobile banking");
		
	}

	@Override
	public void getROI() {
		// TODO Auto-generated method stub
		System.out.println("HDFC get roi");
		
	}
	
}

class icici implements RBI{

	@Override
	public void CheckBalance() {
		// TODO Auto-generated method stub
		System.out.println("icici this is check balance method");
		
	}

	@Override
	public void mobileBanking() {
		// TODO Auto-generated method stub
		System.out.println(" icici mobile banking");
		
	}

	@Override
	public void getROI() {
		// TODO Auto-generated method stub
		System.out.println(" icici get roi");
		
	}
	
}

