package basic;

public class valuereturn {

	public static void main(String[] args) {
		valuereturn obj1 =new valuereturn();
				int d= obj1.add();
				System.out.println("The value of "+d);
		

	}
	public  int   add() 
	{
		int a=10;
		int b=10;
		int c=a+b;
		return c;
	}
	
}
