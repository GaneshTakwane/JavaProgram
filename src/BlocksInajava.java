
public class BlocksInajava {
	 int a;
	 static int b;
	 
	 
	 BlocksInajava(){
			System.out.println("0 args constructor");
		}
	
	{
		System.out.println("this is instance block");
	}
	
	static {
		b=30;
		System.out.println("this is static block");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is main method");
		BlocksInajava b=new BlocksInajava();
		System.out.println("end");
		

	}

}
