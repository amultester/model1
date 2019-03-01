package Arraydemo;

public class array {

	public static void main(String[] args) {
		
    int name_id[] =new int[4];
   // int i=0;
    name_id[0]=20;
    name_id[1]=40;
    name_id[2]=60;
    name_id[3]=80;
     System.out.println("The array value is " +name_id[2]);
   
     
     String student_hobby[]=new String [4];
     
      student_hobby[0]="reading";
      student_hobby[1]="walking";
      student_hobby[2]="playing";
      student_hobby[3]="talking";
      
    int size_of_array = student_hobby.length;
    
    System.out.println(+size_of_array);
	

	for(int i=0;i<size_of_array;i++) 
	{
		System.out.println("line by line value is "+student_hobby[i]);
	}
	
	}
}

