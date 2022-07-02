package AbstractClass;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a= new A();
		
		B b= new B();
		b.m1();
		b.m();
		b.m2();
		b.m3();

	}

}

abstract class A{
	
	A(){
		System.out.println("0 args constructor");
	}
	
	void m1() {
		System.out.println("this is method m1");
	}
	abstract void m();
	abstract void m2();
	abstract void m3();
}

class B extends A{
	
	B(){
	  super();	
	}
	
	void m1(){
		System.out.println("method m1 from class b");
	}

	void m() {
		System.out.println("method m");
	}
	void m2() {
		System.out.println("method m2");
	}
	
	
	
}

class C extends A{

	@Override
	void m() {
		System.out.println("Class c method m");
		
	}

	@Override
	void m2() {
		System.out.println("Class c method m2");
		// TODO Auto-generated method stub
		
	}

	@Override
	void m3() {
		System.out.println("Class c method m3");
		// TODO Auto-generated method stub
		
	}
	
}

