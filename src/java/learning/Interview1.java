package learning;

import java.util.HashMap;

public class Interview1 
{

	
	
	
	public static void main (String[] args)

	{
		String text = "SSHIVANI";
		
		char arr[]= text.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		HashMap<Character,Integer> map2 = new HashMap<>();

		for (char c : arr)
		{
			 if(!map.containsKey(c))
			 {
				 map.put(c, 1);
			 }
			 
			 else
			 {
				 int count = map.get(c);
				 map.put(c, count+1);
				 map2.put(c, count+1);
		      }		 
		}
		
		 System.out.println(map2);				
	}



}
