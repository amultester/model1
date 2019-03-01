package polymorphism;

public class methodoverridding {

	public static void main(String[] args) {
		
		methodoverridding obj1= new methodoverridding();
		obj1.type1(20,30);
		obj1.type1(20, 40, 60);
		obj1.type1(20, 80);
		obj1.type1(20, 40, 100);
		obj1.type1(126, 20);
		obj1.type1(20,94);
				
	}
	
	//no of arguments
	
	public void type1(int a,int b)  

	
	{
		int c=a+b;
	
		System.out.println("no of arguments 1 is"+c);
	}
	
   public void type1(int a,int b,int d) 
	
	{
		int c=a+b+d;
	
		System.out.println("no of arguments 2 is"+c);
	}
	
	
 //type of arguments
   
   public void type1(int a,short b)   
	
	{
		int c=a+b;
	
		System.out.println("type of arguments 1 is"+c);
	}
   
   public void type1(int a, short b,char d)   
	
  	{
  		int c=a+b+d;
  	
  		System.out.println("type of arguments 2 is"+c);
  	}
	
   
   //order of arguments
   
	public void type1(int a,char b)      
	
	{
		int c=a+b;
	
		System.out.println("order of arguments 1 is"+c);
	}
	
public void type1(char a,int b)   
	
	{
		int c=a+b;
	
		System.out.println("order of arguments 2 is"+c);
	}
	

}
