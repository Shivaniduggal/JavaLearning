package package2;

public class class2  
{

	public static void main(String [] args)
	{
		System.out.println("CLASS2");

		
	//	ModifiersExample obj2 = new ModifiersExample();
		
		ModifiersExample modifiersExample = new ModifiersExample();
		modifiersExample.method_protected();
		ModifiersExample.method_default();
		
		ModifiersExample modifiersExample2 = new ModifiersExample();
		modifiersExample2.method_public();
	
	
	}
	
	
}
