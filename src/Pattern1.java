
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalRow=10;
		for(int row=1;row<=totalRow;row++) {
			for(int st=1;st<=totalRow-row+1;st++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
