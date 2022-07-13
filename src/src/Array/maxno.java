package Array;

public class maxno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {40,20,30,44,55,67};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)     // i=0,....i=5
		{
			if(a[i]>max)    // 40>0 // 20>40// 30>40 //
			{
				max=a[i];	//max= 40, 
			}
			
		
		}
		System.out.println("MAX No is " + max);
	
		int min =a[0];
		for(int j=0;j<a.length;j++ )
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		System.out.println("Min no IS " + min);
		
		int p=max-min;
		
		System.out.println("Profit is = " + p);
	}
	
}
