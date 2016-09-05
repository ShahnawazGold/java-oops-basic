
class Person
{
	
	// inhertancc /////////////////
	// inhrtance ////////////////
	
	
	private int age ;
	
	private String name ;
	
	public void setName(String n)
	{ 
	    // name private or n pass krwaya
		name = n;
		
	}
	
	public String getName ()
	{
		
		return (name);
	}
	
    public void setAge(int a)
	{ 
	    // name private or n pass krwaya
		age = a;
		
	}
	
	public int getAge ()
	{
		
		return (age);
	}

}

class Student extends Person
{
	private int roll ;
	
	  public void setRoll(int r)
	{ 
	    // name private or n pass krwaya
		roll = r;
		
	}
	
	public int getRoll ()
	{
		
		return (roll);
	}
	
}



public class Example
{
	
	 public static void main (String args[])
	{
	  Student s = new  Student() ;
	  
	  s.setRoll(3466);
	  s.setName("bhsi");
	  s.setAge(22);
	  
	  System.out.println("Constructor bhai"+s.getRoll ()  );
	  System.out.println("Constructor bhai"+s.getName ()  );
	  System.out.println("Constructor bhai"+s.getAge ()  );
	 
	}
	
}


