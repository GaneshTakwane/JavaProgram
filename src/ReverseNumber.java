
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=12345;
		int rev_Number=0;
		
		while(number>0) {
			int rem=number%10;
			number=number/10;
			rev_Number=rev_Number*10+rem;
		}	
		System.out.println(rev_Number);
	}

}
