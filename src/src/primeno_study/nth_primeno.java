package primeno_study;

import java.util.Iterator;
import java.util.Scanner;

public class nth_primeno {

	public static void main(String[] args) {
			
		int input =10;
		int n=1, c=0,i;
		
		while(c<input)
		{
			n=n+1;
			for(i=2;i<=n;i++)
			{
				if(n%i==0)
				{
					break;
				}
				if(i==n)
				{
					c=c+1;
				}
				
				
			}
		}
		System.out.println(n);
	}

}
