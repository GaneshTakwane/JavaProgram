package SupperInJava;

public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b= new B();
		b.printDataB();

	}

}


class A{
	void printDataA() {
		System.out.println("Class A");
	}
	
}

class B extends A{
	void printDataA() {
		System.out.println("Class B");
	}
	void printDataB() {
		super.printDataA();
	}
	
}








class C extends B{
	int a=50;
	
}

