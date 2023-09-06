package learning;

import java.util.HashMap;

public class occurenceCount {

	public static void main (String[] args)
	{
		String A = "Helloooo This Is ABBABBA";
		A= A.trim().toLowerCase();

		String Words[]= A.split(" ");
//System.out.print(Words);

for(String s : Words) {
	System.out.println(s);
}

System.out.println(Words.length);



HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
	char arr[] = A.toCharArray();
	
	for (char i :arr)
	{
		
		
		if(!map.containsKey(i))
		{
			map.put(i,1);
		}
		else
		{
        int count = map.get(i);
		
		map.put(i,count+1);
		
		
		}

		//System.out.println(map);

	}
	
	System.out.println(map);
	
	
	
	}
}
