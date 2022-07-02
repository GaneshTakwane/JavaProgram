import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------Start-----------");
		int a[]= {10,20,40};
		try {
			System.out.println(a[2]);
			System.out.println(2/2);
			System.out.println("in side try block");
		}
		
		
		catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println(aie.getMessage());
          System.out.println(a[2]);
          
         
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			 System.out.println(2/2);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("this is finally block");
		}
		
		
		System.out.println("hello java");

	}

}
