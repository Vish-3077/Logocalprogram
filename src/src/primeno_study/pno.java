package primeno_study;
import java.util.Scanner;


public class pno {

	public static void main(String[] args) {
	
		System.out.println("Enter");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		 
		for(int j=50;j<=100;j++)
		{	
			int count =0;
			
			for(int i = 1;i<=n-1; i++)
				{
					if(n % i==0)
					{
						count++;
					}
				}
				if(count == 2)
				{
					System.out.println("THE NUMBER IS PRIME ");
					
				}
				break;
	}

}
}