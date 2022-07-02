
public class StaticMethodInjava {
	int a=10;
	static int b=10;

	void m1() {
		System.out.println("this is instance method m1"+a);
		m2();
	}
	
	static void m2() {
		
		StaticMethodInjava sm=new StaticMethodInjava();
		sm.m1();
		m3();
		
		System.out.println("this is static method m2"+b);
	}
	
	static void m3() {
		System.out.println("this is static method m2");
	}
}
