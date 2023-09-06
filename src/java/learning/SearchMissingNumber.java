package learning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//There is an array where numbers are present from 1 to n and number x is missing. find the number x.  


public class SearchMissingNumber

{
	//search in sorted array 
	
static int sortedArray[]= {4,5,6,8,9,10};	
static int n = 4;
	static int b[]= {2,4,5,7,3,9,6,1,10};
	

    
	public static void main(String[] args)
	{
		//SearchSortedArray(sortedArray);
		List<Integer> arr = new ArrayList<>();
        System.out.println(sortedArray.length);
	}
	
	static void SearchSortedArray(int sortedArray[])
	{
		for(int i = 0; i<sortedArray.length-1; i++)
		{
			if(sortedArray[i] != (n+0))
			{
			System.out.println(sortedArray[i]-1);
            break;
			}
			System.out.println("TEST");

			
		}
	}
		
		static void SearchUnsortedArray(int unsortedArray[])
		{

		for (int i :unsortedArray)
		{
			if(unsortedArray[i] == n)
			{
				
			}
		}
			
			
		
	}
	
	
	
}
