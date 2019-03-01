package basic;

public class slit {

	public static void main(String[] args) {
		
		
		String statement1="How-are-you";
		String[]	statement2 = statement1.split("-");
		for( int i=0; i<statement2.length; i++)
		{
			System.out.println("print the value of " +statement2[i]);
		}
	}
}
