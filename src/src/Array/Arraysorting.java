package Array;

import java.util.Arrays;

public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,242,3,1000,10,23,54,57,79,10};
		
		System.out.println("ARRAY BEFORE SORTING" + Arrays.toString(a));
		
		int c;
		for (int i = 0 ; i < a.length-1; i++) 
		{
			for (int j = 0; j < a.length-1; j++) 
			{
				if(a[j]>a[i+1]) 
				{
					c=a[j];
					a[j]=a[i+1];
					a[i+1]=c;
				}
			}
		}
		
		System.out.println("ARRAY AFTER SORTING" + Arrays.toString(a));
			
		
	}

}
