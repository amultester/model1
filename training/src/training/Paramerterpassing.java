package training;

public class Paramerterpassing {

	public static void main(String[] args) {
		
		Paramerterpassing obj = new Paramerterpassing();
		
		obj.sum ( "Amul",  "Raj");
		
		
	}
	
	public void sum(String First,String last)
	{
	String name = First + last ;	
		
	System.out.println("The result is "+name );	
		
	}

}
