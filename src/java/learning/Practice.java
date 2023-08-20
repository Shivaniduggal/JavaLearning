package learning;
		import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {





		    public static void main(String[] args)
		    {
		        Set<Integer> a = new HashSet<>();
		        a.add(1);
		        a.add(2);
		        a.add(3);
		        a.add(1);

			     System.out.println(a);
		     List<Integer> arr = new ArrayList<>(a);
		     System.out.println(arr);
		     System.out.println(arr.get(1));
		     
		     String inputString = "Hello World"; 

		     String subString = inputString.substring(1,7);
		     System.out.println(subString);

		    }
		}


