package training;

public class This_operator {

	
	int x;
	int y;
	
	public This_operator(int a,int b)
	{
		
		this.x=a;
		this.y=b;
		
	}
	
	
	public void display() {
		
		
		System.out.println("A value"  +x+ " B Vaqlue" +y);
	}
	
	
	public static void main (String[]args)	{
		
		This_operator tp = new This_operator(10,20);
		tp.display();
		
	}
}
