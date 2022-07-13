package reverseno_study;



public class reverseno {

	
	public static void main(String[] args) {
		
		String name = "VISHWAJEET";
		int l=name.length();
		 String rev ="";
		 
		for(int i=l-1;i>=0;i--)     // i =index of last character, index of char at 0 , i-- = decrement;
		{
			rev=rev+name.charAt(i);  // rev=T, rev: T+E --- Rev =TE,
		}
		
		System.out.println(rev);
}
}
