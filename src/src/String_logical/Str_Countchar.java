package String_logical;

public class Str_Countchar {

	public static void main(String[] args) {
		
		String str= "Insane X Tu Aake Dekhle X Peaches (Mashup)";
		
		// Read the lenth except the "SPACES"
		
		int lenth=0;

		for(int i=0;i<=str.length()-1;i++ )
		{
			if(str.charAt(i)!=' ' )
			{
				lenth++;
			}
		}
		System.out.println("The total number of character in String = " + lenth);
	}

}
