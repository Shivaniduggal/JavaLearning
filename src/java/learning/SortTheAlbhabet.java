package learning;

// I need to sort characters in my Alphabet
public class SortTheAlbhabet 
{
	    public static void main(String[] args) {
	        String input = "SHIVANI";

	        // Convert the string to a character array
	        char[] charArray = input.toCharArray();

	        // Sort the character array
	        java.util.Arrays.sort(charArray);
	        
	        // Convert the sorted character array back to a string
	        String sortedString = new String(charArray);

	        System.out.println("Original String: " + input);
	        System.out.println("Sorted String: " + sortedString);
	    }
	}
/* String input = "SHIVANI";: This line initializes a string named input with the value "SHIVANI", which is the string you want to sort.

char[] charArray = input.toCharArray();: This line converts the input string into an array of characters using the toCharArray() method. This allows you to work with the individual characters of the string.

java.util.Arrays.sort(charArray);: Here, the sort() method from the java.util.Arrays class is used to sort the character array in ascending order. After this line, the charArray will contain the characters of the original string sorted in alphabetical order.

String sortedString = new String(charArray);: This line converts the sorted character array charArray back into a string using the String constructor. This creates a new string with the characters in their sorted order.

System.out.println("Original String: " + input);: This line prints the original input string.

System.out.println("Sorted String: " + sortedString);: This line prints the string after sorting the characters alphabetically.

--*/
