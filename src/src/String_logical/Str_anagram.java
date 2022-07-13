package String_logical;

import java.util.Arrays;

public class Str_anagram {

	public static void main(String[] args) {

		//Compare 2 Strings and check the character should be equals.
		
		String str1="elbow";
		String str2="below";
		
		char STR1[]=str1.toCharArray();
		char STR2[]=str2.toCharArray();
		
		Arrays.sort(STR1); //sort arrays 
		Arrays.sort(STR2);
		
		if(Arrays.equals(STR1, STR2))
		{
			System.out.println("str1 + str2 are anagram");
		}
		
	}

}
