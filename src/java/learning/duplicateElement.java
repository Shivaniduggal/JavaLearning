package learning;

import java.util.ArrayList;

public class duplicateElement
{

	public static void main (String[]args)
	{
		ArrayList<Character> Arr = new ArrayList<>();

		ArrayList<Character> Arr2 = new ArrayList<>();

		Arr.add('A');
		Arr.add('B');
		Arr.add('C');
		Arr.add('D');
		Arr.add('B');
		Arr.add('E');

		for (int i=0;i<Arr.size();i++)
		{
			for(int j=i+1;j<Arr.size();j++)
			{
				if (Arr.get(i).equals(Arr.get(j)))
				{
					Arr2.add(Arr.get(j));
					Arr.remove(j);
				}
		}
		}
		System.out.println(Arr2);
		System.out.println("array"+Arr);



	
	}
}
