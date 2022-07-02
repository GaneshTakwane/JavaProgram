package multilavel;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		B b= new B();
		b.printB();
		b.printA();
		
		
//		D d = new D();
//		d.printA();
//		d.printB();
//		d.printC();
//		d.printD();

	}

}

class A{
	void printA() {
		System.out.println("class A");
	}
}

class B extends A{
	void printB() {
		System.out.println("Class B");
	}
}
class C extends B{
	void printC() {
		System.out.println("Class C");
	}
}
class D extends C{
	void printD() {
		System.out.println("Class D");
	}
}
