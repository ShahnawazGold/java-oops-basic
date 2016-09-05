

public class Constpara
{
	
	
	 private int a, b;
	//Constructor paramertization
	Constpara( int m ,int n)
	{
		a= m;
		b= n;
		
	  //System.out.println("Constructor bhai");	
	}
	
	void showData()
	{
		System.out.println(a);		
		System.out.println(b);		
	}

	
    public static void main (String args[])
	{

		Constpara b = new Constpara(6,12);
          b.showData();		
		
	 
	}

}