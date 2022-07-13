package Palindromeno;

public class palindrome_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 121;
		int a = no;
		int rev=0, b;
		
		while ( a!= 0 )
		{
			b= a %10 ; // b =1  // again loop will execute  then b =2 /// 12%10 = 2
			rev= rev*10 + b ; // 1 //1*10=10+2=12 // 12*10=120 +1=121
			a=a/10; // 12 // 1 //
		}
		
		if(no == rev)
		{
			System.out.println( no + " = this is palindrome number");
		}
		else 
		{
			System.out.println("this is not palindrome number");
		}
	}

}
