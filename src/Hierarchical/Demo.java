package Hierarchical;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d= new D();
		d.PrintA();
		d.printD();
		
		
		C c= new C();
		c.PrintA();
		c.printC();
		

	}

}

class A{
     void PrintA(){
    	 System.out.println("Class A");
     }
}

class B extends A{
	void PrintB() {
		System.out.println("Class B");
	}
}

class C extends A{
	void printC(){
		System.out.println("Class C");
	}
}

class D extends A{
	void printD(){
		System.out.println("Class D");
	}
}
