package ExceptionInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		ThrowsDemo td= new ThrowsDemo();
		
		td.m2();
		
	}
	
	void readFileData() throws FileNotFoundException  {
		File f= new File("c://data.txt");
		FileInputStream fs= new FileInputStream(f);
		
	}
	void m2() throws FileNotFoundException{
		
		readFileData();
		
	}

}
