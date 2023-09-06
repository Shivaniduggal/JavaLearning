package learning;


//this class is to calculate the sum of integers present in string . Input String - Shiv1a4ni8.
//so calculate the sum of intergers 


public class SumOfIntegersInString 
{
public static void main (String[] args)
{
	String Text = "Sh3i4v5a98ni";
	//ArrayList<Character> arr = new ArrayList();
	int Sum = 0;
	char zero = '0';
	int zeroc= '0';
	
for(int i=0; i< Text.length();i++)
{
	char a = (Text.charAt(i));
	
    if (Character.isDigit(a))
    {
    	//arr.add(i);
    	//int k = (int)a;
    	System.out.println("Number in String is "+ a);
    	
    	int AsciValue = a;
    	System.out.println("ASCI value of "+a+"is"+AsciValue);

    	int numericValue = a - '0';
    	
    	
    	System.out.println("ASCI value of 0 is  "+zeroc);

    	System.out.println("numericValue "+numericValue);

    	Sum =Sum +numericValue;
    	System.out.println("sum "+Sum);

    	
    }

	
}


}

	
	
	
	
}
