package reversestr_study;

public class reversestudy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="VISHWAJEET KOLAPKAR "; // 10 i>=0 
		String rev="";
		
		int l=str.length();
		
		for(int i= l-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);  //DAS
		}
		
		System.out.println("REVERSE NO IS : " + rev);
	}

}
