package Array;

public class max2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {10,20,1,-5,4,7,9,6,1,0,77,12,15,64,97};
		
		int flar=ar[0];
		int slar=ar[0];
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]>flar)
			{
				flar=ar[i];
				
			}
			if(ar[i]!=flar)
			{
				if( ar[i] > slar )
				{
					slar=ar[i-1];
				}
			}
		}
		System.out.println("First large no = " + flar);
		System.out.println("second large no = " + slar);
		
	}

}
