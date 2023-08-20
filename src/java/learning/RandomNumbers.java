package learning;

public class RandomNumbers
{
		public static void main (String args[])
	{
		System.out.println("Testing");

		
		 String userName = ""+(int)(Math.random()*1000);
		// System.out.println(Math.random());
		 
	//	 System.out.println(Integer.MAX_VALUE);
		 
		 String emailID = "User"+userName+"@yopmail.com";
		 System.out.println("email ID" + emailID);
		 System.out.println("userName" + userName);

	
	}
}
