package learning;

public class RemoveSpecialCharacters 
{

	public static void main(String[] args)
	{
		String K = "S--h@@##i99va(())n--i";
		// ^ = this means no equals to in below exp, replace all the char where the value is not equal to mentioned. 
		String Final = K.replaceAll("[^a-zA-Z0-9]", "");
		System.out.print(Final);
				
	}
	
	
}
