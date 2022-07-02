package Polymorphism;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h= new HDFC();
		h.DisplayROI();

	}

}

class RBI{
	float ROI=5.5f;
	
void DisplayROI(int a){
		System.out.println("rbi roi is "+ROI);
		 
		
	}
	
}
class HDFC extends RBI{
	void DisplayROI(int nbdshfgyg){
		int a=10;
		System.out	.println("HDFC ROI is "+(ROI+2));
		
	}	
}
