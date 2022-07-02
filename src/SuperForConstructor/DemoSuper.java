package SuperForConstructor;

public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		D d= new D();
	}
}

class A{

	A(){
		System.out.println("class A, 0 args constructor");
	}
	A(int a){
		System.out.println("class A,1 args constructor");
	}
	A(int a,int b){
		System.out.println("class A,2 args constructor");
	}

}

class B extends A{
	B(){

		System.out.println("class B, 0 args constructor");
	}

	B(int a){
		System.out.println("class B, 1 args constructor");
	}
	B(int a,int b){
		super(30,40);
		System.out.println("class B, 2 args constructor");
	}
}

class C extends B{
	C(){

		System.out.println("class C, 0 args constructor");
	}

	C(int a){
        super(10,20);
		System.out.println("class C,1 args constructor");
	}

}

class D extends C{
	D(){
		super(10);
		System.out.println("class D,0 args constructor");
	}
	
}