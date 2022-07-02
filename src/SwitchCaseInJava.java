
public class SwitchCaseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		// 1- addition of 2 number
		// 2- substraction of 2 number 

		int key=1;
		int a=20;int b=40;
		int result=0;
		switch (key) {
		case 1: {
			result= a+b;
			System.out.println("Addition of 2 number is="+result);
			break;
		
		}
		case 2: {
			result= a-b;
			System.out.println("subtraction of 2 number is="+result);
			break;
		}
		case 3: {
			result= a*b;
			System.out.println("multiplication of 2 number is="+result);
			break;
		}
		case 4: {
			result= a/b;
			System.out.println("division of 2 number is="+result);
			break;
		}
		
	

		default:
			System.out.println("Enter valid option form 1,2,3,4");
		}

	}

}
