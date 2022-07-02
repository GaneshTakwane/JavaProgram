package ThisKeyword;

public class ThisDemo {
	
	ThisDemo(){
		 //call
		this(10);
		System.out.println("0 args constructor");
		
	}
	
	ThisDemo(int a){
		this(20,30);
		System.out.println("1 args constructor");
	}
	
	ThisDemo(int a,int b){
		this(10,20,30);
		System.out.println("2 args constructor");
	}
	
	ThisDemo(int a,int b,int c){
		System.out.println("2 args constructor");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo t= new ThisDemo();

	}

}
