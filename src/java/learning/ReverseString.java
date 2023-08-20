package learning;

public class ReverseString 
{
public static void main (String[] args)
{
	String a = "SHIVANI DUGGAL";

	char chArray[]= a.toCharArray();
	
	//System.out.print(a.length()-1);

	for(int i= a.length()-1; i>=0 ;i--)
	{
		System.out.print(chArray[i]);
	}

}


	
	
}
