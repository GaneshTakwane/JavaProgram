
public class Students {
	int rollNumber;
	String name;
	String address;
	
	Students(int studRollNumber,String studName,String StudAddress){
		rollNumber=studRollNumber;
		name=studName;
		address=StudAddress;
	}
	
	
	void getStudent() {
		System.out.println("Name="+name);
		System.out.println("RollNumber="+rollNumber);
		System.out.println("Address="+address);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students ram= new Students(1001,"Ram","pune b1004");
		ram.getStudent();
		System.out.println("--------------------------------------");
		Students tom= new Students(1001,"tom","pune b105");
		tom.getStudent();
	}

}
