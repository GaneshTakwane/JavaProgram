
public class ConstructorInJava {

	ConstructorInJava(){
		System.out.println("This is 0 args constructor");
	}

	ConstructorInJava(int a){
		System.out.println("This is 1 args constructor");
	}

	ConstructorInJava(int a,float b){
		System.out.println("This is 2 args constructor");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start main");
		ConstructorInJava ci=new ConstructorInJava();

		System.out.println("End main");
	}

}
