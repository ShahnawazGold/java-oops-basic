

public class Box
{
	
	private  int lenght, height ;
	
	
	public void setData(int l, int h)
	{
		lenght = l;
		height = h;
		
	}
	
	public void showData ()
	{
		System.out.println("lenght ="+lenght);	
		System.out.println("height="+height);
		
	}
	
	
    public static void main (String args[])
	{

			Box b = new Box();
			b.setData(5,7);
			b.showData();
	 
	}

}