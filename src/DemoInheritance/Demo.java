package DemoInheritance;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.display();
		p.show();
		
//		Child c = new Child();
//		c.display();// parent
//		c.show();//ch
//		System.out.println(c.var1);
//		System.out.println(c.var2);

	}

}

class Parent{
	int var1=30;
	
	void display() {
		System.out.println("Var1="+var1);
	}
	
}

class Child extends Parent{
	int var2=40;
	void show() {
		System.out.println("var2="+var2);
	}
}

class Child2 extends Parent{
	
}

