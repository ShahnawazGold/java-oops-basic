

public class Box2
{
	
	private  int a, b ;
	
	
	public void setData(int m, int n)
	{
		a = m;
		b = n;
		
	}
	
	public void showData ()
	{
		System.out.println("a ="+a);	
		System.out.println("b="+b);
		
	}
	
	
    public static void main (String args[])
	{

			Box2 b = new Box2();
			b.setData(5,7);
			b.showData();
	 
	}

}