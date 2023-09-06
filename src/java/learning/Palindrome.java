package learning;

public class Palindrome {

    public static void main(String[] args) {
      //  String text = "I";  // Input string
    //palindrome(text);
    
    String Sentence = "I am nitin";
    String Words[]= Sentence.split(" ");

for (String Word :Words)
{
//	System.out.println(Word);
	palindrome(Word);
}
    
    }
        
        static void palindrome(String text)
        {
            int length = text.length();

        	if(text.length()==1) {
        		System.out.println(  "Only One char");
        	}
        	else
        	{
             boolean palindrome = true;  // Initialize palindrome flag to true
             for (int i = 0; i < length / 2; i++) {
        
        	if (text.charAt(i) != text.charAt(length - 1 - i)) 
        	{
                palindrome = false;  // If characters don't match, set palindrome flag to false
                break;
            }
        
        }

        System.out.println(text + "  Is palindrome: " + palindrome);  // Print the result
        	}
}}