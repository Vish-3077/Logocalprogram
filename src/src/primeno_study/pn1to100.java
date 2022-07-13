package primeno_study;

public class pn1to100 {

	public static void main(String[] args) {
		

		
		for(int n=50;n<=100;n++) 
		{
			
			int count = 0;
		
			for(int i = 2;i<=n-1; i++)
				{
					
					if(n%i==0)
					{
					count++;
					}
				}
					if(count == 0)
					{
						System.out.println(n);
					}
					
		}
	}

}
