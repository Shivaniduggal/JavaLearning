package learning;

public class Palindrome {

    public static void main(String[] args) {
        String text = "MALAtgtYALAM";  // Input string
        
        int length = text.length();
        
        boolean palindrome = true;  // Initialize palindrome flag to true

        for (int i = 0; i < length / 2; i++) {
        
        	if (text.charAt(i) != text.charAt(length - 1 - i)) {
                palindrome = false;  // If characters don't match, set palindrome flag to false
                break;
            }
        }

        System.out.println("Is palindrome: " + palindrome);  // Print the result
    }
}
