package basic;

public class Passingparameter {

	public static void main(String[] args) {
		Passingparameter obj1 =new Passingparameter();
		obj1.add(10, 10);

	}
	public void add(int a,int b)
	{
		System.out.println("The program start");
		
		int c=a+b;
		System.out.println("The addition value is " +c);
	}

}
