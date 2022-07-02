
public class MethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsInJava mj=new MethodsInJava();
		//mj.add(10.10f,20);
		//mj.add(100.30f, 200);
		//mj.add(55.55f, 66);

		int result=mj.add(30,40);
		System.out.println("Result="+result);
		int result1=mj.add(300,400)+100;
		System.out.println("Result1="+result1);
		
		int a[]= {2,40,20,1,36};
		System.out.println("Min number is "+mj.minNumber(a));




	}
	///30.30 +10

	int add(int a, int b) {
		int c=a+b;
		return c;
	}


	int minNumber(int a[]) {
		int minNumber=a[0];
		for(int i=1;i<a.length;i++) {
			if(minNumber>a[i]) {
				minNumber=a[i];
			}
		}
		return minNumber;
	}
	
	int[] sort(int a[]) {
		
		return a[];
	}

}
