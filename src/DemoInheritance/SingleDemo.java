package DemoInheritance;

import java.awt.print.Printable;

public class SingleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		b.printData();
		b.printMsg();

	}

}

class A{

	void printMsg(){
		System.out.println("this is class A");
	}
}

class B extends A{
	void printData() {
		System.out.println("class B print method");
	}
}



