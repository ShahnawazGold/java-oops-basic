

class Shahoveriding
{
	void fun(int a)
	{
		 System.out.println("Constructor bhai");
	}
	
	void fun(int a, int b)
	{
		 System.out.println("Constructor bhai2");
	}
	

	
    public static void main (String args[])
	{

		Shahover b = new Shahover();	
		
		b.fun(3);
		b.fun(2,5);
	 
	}

}