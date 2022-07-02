package Polymorphism;

public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoPolymorphism d= new DemoPolymorphism();
		float result=d.add(10, 20.30f);
		System.out.println(result);

	}
	
	
	static int add(int a,int b) {
		int r=a+b;
		return r;
	}
	
private	double add(double a,double b) {
		double r=a+b;
		return r;
	}
	
final float add(int a,int b,float c) {
		float r=a+b;
		return r;
	}
	
	
	float add(float a,int b) {
		float r=a+b;
		return r;
	}
	
	float add(int a,float b) {
		float r=a+b;
		return r;
	}
	
	float add(float a,float b) {
		float r=a+b;
		return r;
	}
	
	int add(int a, int b, int c) {
		int r=a+b+c;
		return r;
	}
	
	int add(int a, int b,int c, int d) {
		int r=a+b+c+d;
		return r;
	}

}
