import java.util.*;

public class Times
{
	
	

	
    public static void main (String args[])
	{

		
		Calendar obj = new GregorianCalendar();
		
		Int y,m ,d;
		
		y = obj.get(Calendar.YEAR); 
		m = obj.get(Calendar.MONTH); 
		d = obj.get(Calendar.DATE); 
		
		 System.out.println(y+":"+m+":"+d);
	    
	}

}