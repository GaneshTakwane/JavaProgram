package ThisKeyword;

public class Student {
	String name;
	int age;
	
	void setSetInfo(String name,int age){
		this.name=name;
        this.age=age;
	}
	
	void printInfo(){
		System.out.println("name= "+name+ " age= "+age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
		s.setSetInfo("Amit", 29);
		s.printInfo();
		
		

	}

}
