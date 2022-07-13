
public class fib1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=0;  int b=1;
		//int a =11;
		
		
		for (int i=1 ; i <= 10 ; i++)
		{
			
			
			int c = a+b;
			a=b;
			b=c;
			System.out.println( b );
		}
	}

}
