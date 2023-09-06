package package2;

import learning.modifiers2;

public class ModifiersExample 
{

	private static int a = 5;
	public static void main (String[] args)
	{
		
		
		System.out.println("class modifiers example");
	
	ModifiersExample obj1 = new ModifiersExample();
	//modifiers2 obj2 = new modifiers2();
	
	
	method_private();
	
	
	method_protected();
	}
	
	static private void method_private()
	{
		System.out.print("METHOD 1");
	}
	
	 static protected void method_protected()
	{
		System.out.print("METHOD 2");
	}	
	static void method_default()
	{
		System.out.print("METHOD 3");
	}
	 public void method_public()
		{
			System.out.print("METHOD 5");
		} 
	  void method6()
		{
			System.out.print("METHOD 6");
		}
	
	
}
