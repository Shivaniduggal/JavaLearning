package learning;
import java.util.HashSet;

public class MainClass
{
	static int a[]= {1,4,6,9,3,0,24,04,83};
public static void main(String[] args)
{
	MainClass.remove_duplicatebyhash();

}

 static void remove_duplicatebyhash()
{

	HashSet<Integer> hash = new HashSet<Integer>();

	for (int element : a) {
		hash.add(element);
		System.out.println();

		
	}
	System.out.println(hash);
}

}
