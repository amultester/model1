package training;

public class IFcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int moneyvalue =100;
		 
	if(moneyvalue>=1000)
		{
			System.out.println("The currency value is "+moneyvalue);
		}
		
	else 
	{
		System.out.println("The currency value is null");
	}
	
	
	String message="gmail";
	
	if(message.startsWith("m"))
	{
		System.out.println("Send reply message through gmail");
	}
	else if (message.startsWith("whatapp"))
	{
		System.out.println("Send reply message through whatapp");
	}
	else if (message.startsWith("fb"))
	{
		System.out.println("Send reply message through fb");
	}
	
	else 
	{
		System.out.println("Ignore the message");
	}
	
	
	
	}

}
