package training;

public class demo1 {
    int x=100;                                                     // input value is intilize above the method 
    int y=50;
	public static void main(String[] args) {
		System.out.println("Program start");
		demo1 obj = new demo1 ();
		obj.sub();
		
		demo2 obj1 = new demo2 ();                                  //different class is called under this method 
		obj1.sum();
		
		demo1.multi();                                              // static have to call like this 
		System.out.println("Program end");
	}
	
	public void sub()                                               //  for non static method the value can intilize within the method or outside the method
	{
		System.out.println("The value is X is "+x );
		System.out.println("The value Y is "+y);
	//int x=200;                                                      
	//int y=50;															  Input value is intilize within the class 
	int z=x-y;
	System.out.println("The sub value is "+z );
	}
	
	public static void multi()
	{
		
		int x=500;                                                    //  input value is intilize within the method 
		int y=50;	
		System.out.println("The value is X is "+x );
		System.out.println("The value Y is "+y);                    //	for static method the value can intilize within the method 
		int d= x/y;
		System.out.println("The multiple value is "+d);
		
	}
}