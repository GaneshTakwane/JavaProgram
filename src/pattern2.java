
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int TotalRow=5;
		
		for(int row=1;row<=TotalRow;row++) {
			for(int sp=1;sp<=TotalRow-row;sp++) {
				System.out.print(" ");
			}
			for(int st=1;st<=2*row-1;st++) {
				System.out.print("*");
			}
			
			System.out.println();	
		}

	}

}
