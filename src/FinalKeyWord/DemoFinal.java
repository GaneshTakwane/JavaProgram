package FinalKeyWord;

import java.io.File;
import java.io.FileInputStream;

public class DemoFinal {
	final static int a;//blank final 
	
	static {
		a=30;
	}
	

	void getData() {
		//	a=60;
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.getData();
		
		


	}

}


 class A{
	 int a=30;
	final void getData() {
		System.out.println("This is class A getdata Method");
	}
}
 
 class B extends A{
	 void putData() {
		 System.out.println("class B ");
	 }
 }


