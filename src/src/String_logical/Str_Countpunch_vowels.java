package String_logical;

public class Str_Countpunch_vowels {

	public static void main(String[] args) {
		
		String str="'#King x AP Dhillon' | ,.'Tu Aake Dekhle @ Insane Mashup'// | DJ SKR & NARESH PARMAR!!! | Lo-fi///";
		
		int temp=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='!' || str.charAt(i)==',' || str.charAt(i)=='.' || str.charAt(i)=='/' || str.charAt(i)=='|' || str.charAt(i)=='?' || str.charAt(i)=='@' || str.charAt(i)=='#')
			{
				temp++;
				
			}
			
		}
		System.out.println("The Total number of punch in String : " + temp);
	}

}
