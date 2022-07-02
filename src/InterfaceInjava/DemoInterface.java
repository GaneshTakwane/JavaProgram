package InterfaceInjava;

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
        b.m();
        b.m1();

	}

}

interface A{
	int a=10;
	int b=20;
	void m();
	void m1();	

}

interface B{
	void m();
	void m3();	
}
class C implements A,B{
	int a=30;
	public void m() {
     System.out.println("this is m "+a);
	}

	public void m1() {
     System.out.println("this is m1 "+b);
	}
	
	public void m3() {
		System.out.println("this is m3 method");
	}
}


