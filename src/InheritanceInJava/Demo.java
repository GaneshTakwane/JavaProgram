package InheritanceInJava;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		
		b.
		b.m();
	    System.out.println(b.var1);

	}

}

class A{
	int var1=20;
	void m() {
		System.out.println("this is class A method ");
	}
}

class B extends A{
	void show(){
		System.out.println("this is B class show method");
	}
}
