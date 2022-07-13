package primeno_study;

public class prime_boolean {
	
	public static void main (String[]Args)
	{
		int a = 10; 
		boolean b = false;
		
		for(int i = 1; i <= a/1 ;i++)
		{
			if(a % i == 0)
			{
				b = true;
				break;
			}
			if(!b)
				System.out.println(a + "is a prime number");
			else 
				System.out.println(a + "is not prime number");
		}
		

}
}
