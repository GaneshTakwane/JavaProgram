package ThisKeyword;

public class ThisForMethod {
	
	void m() {
		System.out.println("this is method m");
		this.m2();
	}
	
	void m2() {
		System.out.println("this is method m2");
		
	}
	
	public static void main(String agrs[]) {
		ThisForMethod tm=new ThisForMethod();
		tm.m();
		
	}

}
