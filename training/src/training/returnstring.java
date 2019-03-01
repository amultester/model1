package training;

public class returnstring {

	public static void main(String[] args) {
		
		returnstring obj1 = new returnstring();
		
		String Result =obj1.add("INNO","BOT");
		
		 System.out.println("Expected value is " +Result);
		
		
	}
	
	public String add(String First, String last)
	{
	String name = First + last ;
	
	return name;

		
	}

}