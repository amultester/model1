package basic;

public class child extends parent {

	public static void main(String[] args) {
		child obj1= new child ();
		obj1.add();
		obj1.add2();
		obj1.add3();
		
		parent obj2 = new parent ();
		obj2.add();
		
		
		parent obj3 = new child ();
		obj3.add();
		
		
		//child obj4= new parent ();
		
	

	}
	public void add2()
	{
		System.out.println("child 1");
	}
	public void add3()
	{
		System.out.println("child 2");
	}
	public void add4()
	{
		System.out.println("child 3");
	}


}
