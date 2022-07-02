package Polymorphism;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loginApp sbi=new loginApp();
		sbi.login();
		
		System.out.println("-----------------------------------");
		NewLoginApp hdfc= new NewLoginApp();
		hdfc.login();
		hdfc.NewPassword();

	}

}

class loginApp{
	
	void login(){
		System.out.println("Enter UserName");
		System.out.println("Enter password");
	}
	void NewPassword() {
		System.out.println("set new password");
	}
	
}
class NewLoginApp extends loginApp{
	void login() {
		System.out.println("Enter UserName");
		System.out.println("Enter password");
		System.out.println("mobile number");
	}
}
