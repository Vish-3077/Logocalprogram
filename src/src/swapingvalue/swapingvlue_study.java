package swapingvalue;

public class swapingvlue_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 10, b=20;
		System.out.println(" Values Before swaping a= " + a+ " b=  " + b);
		
		//Using third variable
		
		//int c=a;
		//a=b;
		//b=c;
		//System.out.println(" Values After swaping a= "  + a + " b= " + b );
		
		System.out.println("=======================================");
		
		//using + & -
		
		a=a+b; //10+20=30
		b=a-b; //30-20=10=b
		a=a-b; //30-10=20=a 
		
		System.out.println(" Values After swaping a= "  + a + " b= " + b );
	}

}
