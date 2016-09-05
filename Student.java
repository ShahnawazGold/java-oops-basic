
public class Student
{
	
	
	
	// tak nothin , retun nothing void mean kuch ni//
	void show()
	{
	   System.out.println("shwo nothing");	
		
	}
	
	//take nothing return something//
	int sum ()
	{
		int a,b,c;
		 a =5;
		 b= 6;
		 c =a+b;
		return (c);
		
	}
	
	// take somthing , return nothing///
	void product (int a,int b)
	{
		 System.out.println(a+b);

		
	}
	
	// take something ,return something///
	String fun (String s, int a)
	{
		return (s);
		
	}
	
    public static void main (String args[])
	{

			Student obj = new Student();
			
	         obj.show();
			 int a = obj.sum();
			 
			 obj.product(22,23);
			  
			  obj.fun("shah",45);
			 
			 
	}

}