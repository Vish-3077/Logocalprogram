
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=11; int b = 0; int c=1;
		
		for(int i=1; i < a; i++)
		{
			System.out.println( c );
			
			
			int sum = b + c;
			b=c;
			c=sum;
		}
	}

}
