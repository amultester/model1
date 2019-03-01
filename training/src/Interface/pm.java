package Interface;

public class pm  implements president {

	public static void main(String[] args) {
	
		pm obj1 = new pm();
		obj1.add();
		obj1.add2();
		obj1.add();
		obj1.sub();
		
	// cant create obj for interface ( child X parent)	pm obj2= new president();
	// cant create obj for interface ( parent X parent)  president obj3=new president 	
	
		president obj4 = new pm ();
		obj4.add();
		obj4.sub();

	}
	
	public void add1() 
	{
		System.out.println("pm add1 value is ");
	}
	
	public void add2() 
	{
		System.out.println("pm add2 value is ");
	}

	
	public void add() {
		System.out.println("president add value is ");
	}


	public void sub() {
		System.out.println("president sub value is ");
	}

}
