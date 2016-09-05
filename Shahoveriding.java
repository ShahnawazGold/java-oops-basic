
class A
{
	void fun(int a)
	{
		 System.out.println("CLASS A");
	}
	
	
}

class B extends A
{
	void fun(int a)
	{
		 System.out.println("CLASS B");
	}
	
}
class Shahoveriding 
{
	
    public static void main (String args[])
	{

		B b = new B();	
		
		b.fun(3);
		
	 // ourt put hum ko //classs B// k mily ga
	}

}