package Array;


public class Duplicate_elements {

	public static void main(String[] args) {
		
		String a[]= {"VK","VVK","SD","KM","vK","VK", "SD"};
		
		System.out.println("DUPLICATE ELEMENTS IN STRING :- ");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1 ; j < a.length; j++) 
			{
				if (a[i]==(a[j])) 
				{
					System.out.println(a[j]  );
					
				} 
				
			}
		}
		
		
	}

}
