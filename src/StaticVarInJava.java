
public class StaticVarInJava {
	static int a=10;   //instance variable
	static int b=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVarInJava obj1=new StaticVarInJava();
		System.out.println("Obj1");
		obj1.printAB();
		
		StaticVarInJava obj2=new StaticVarInJava();
		System.out.println("Obj2");
		obj2.printAB();
		
		StaticVarInJava obj3=new StaticVarInJava();
		System.out.println("Obj3");
		obj3.printAB();
		
		
//		StaticVarInJava obj2=new StaticVarInJava();
//		obj2.printAB();
//		StaticVarInJava obj3=new StaticVarInJava();
//		obj3.printAB();
	}
	
	void printAB() {
		a++;
		b++;
		System.out.println("a= "+a+" b= "+b);
	}

}
