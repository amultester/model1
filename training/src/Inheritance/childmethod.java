package Inheritance;

public class childmethod extends parentmethod {

	public static void main(String[] args) {
		
       System.out.println("The Program starts");
       
       
     //  child into child we get both child and parent method 
    childmethod obj1=new childmethod();
       obj1.add();
       obj1.add1();
       obj1.add2();
       obj1.add3();
       
       
    //parent into child we get only parent method    
      /* parentmethod obj2= new childmethod();
       obj2.add();*/
       
     //   parent into parent we get only parent method
       parentmethod obj4 = new childmethod();
       obj4.add();
       
       
	}

	public void add3()
	{
	
	  System.out.println("child result1");
	}
	
	public void add1()
	{
	
	  System.out.println("child result2 ");
	}
	public void add2()
	{
	
	  System.out.println("child result3 ");
	}


	
}


