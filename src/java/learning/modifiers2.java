package learning;

import package2.ModifiersExample;

public class modifiers2 extends ModifiersExample  {
	
	private modifiers2 ()
	{
		System.out.println("INSIDE CONSTRUCTOR modifiers2");
	}
	
	
	public static void main(String [] args)
	{
		System.out.println("CLASS2");

		
		modifiers2 obj2 = new modifiers2();
		
		ModifiersExample modifiersExample = new ModifiersExample();
		modifiersExample.method_protected();
		//ModifiersExample.method_default();
		
		ModifiersExample modifiersExample2 = new ModifiersExample();
		modifiersExample2.method_public();
	
	
	}
	
	

}
