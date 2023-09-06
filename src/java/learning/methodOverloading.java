package learning;

public class methodOverloading 
{
	public static void main(String[] args)
	{
		methodOverloading obj = new methodOverloading();
	obj.method(34.9000, 3);
	}

	public void method(double k, int b)
	{
	       System.out.println("Method String");	
	}
	
	public int method(int a , int b)
	{
	       System.out.println("Method Int");

		return(1);
	
	}
	
	
}
