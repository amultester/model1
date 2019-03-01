package basic;

public class nonstaticmethod {

	public static void main(String[] args) {
		nonstaticmethod obj1 =new nonstaticmethod ();
		obj1.add();

	}
	public void add()
	{
		System.out.println("The program start");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("The addition value is " +c);
	}

}
