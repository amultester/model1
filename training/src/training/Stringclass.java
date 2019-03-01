package training;



public class Stringclass {

	public static void main(String[] args) {
	
	
		/*String statement1=("happy new year");
	
		Boolean result=statement1.startsWith("happy");
	 	
	   System.out.println("The statement is "+result );
				 
	   Boolean result1=statement1.endsWith("year");
	
	    System.out.println("The statement is "+result1 );
	    
	    String statement2=("happy new year");
	    Boolean endvalue= statement1.contains(statement2);
	    
	   System.out.println("The final result is "+endvalue );*/
	
	   
	   String statement3= "Name-is-Amul ";
	   
		  String [] Statement4= statement3.split("-");
	 	  for(int i=0; i<Statement4.length; i++) 
	 	  {
	
		  System.out.println("The outcome is " + Statement4[i]);
	  }
	   
	}   
}
