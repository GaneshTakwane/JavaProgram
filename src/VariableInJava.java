
public class VariableInJava {
	int d=20; //instance variable
	static int s=40;

	void add(){
		int a=20;// local
		int b=40;  // 
		int c=50 ;  
		System.out.println("d="+d);

	}
	public static void main(String args[]) {
		VariableInJava vj= new VariableInJava(); // object
		VariableInJava vj1= new VariableInJava(); 
		VariableInJava vj3= new VariableInJava(); 
		vj1.add();
	}
}
