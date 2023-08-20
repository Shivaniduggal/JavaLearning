package learning;

public class FibonaciSeries 
{
	
	public static void main(String[] args)
	{
		System.out.println("FIBONACCI SERIES");
		 int a = 0;
		 int b=1;
		 int sum;
		
		
		for(int i= 0; i< 10 ;i++)
		{
			sum = a+b;
			a=b;
			b=sum;
			
			//System.out.println("b"+ b);
		//	System.out.println("a"+a);
			System.out.println("sum"+ sum);
		}
		
		
	}
	
	
}
