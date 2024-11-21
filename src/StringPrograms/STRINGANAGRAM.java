package StringPrograms;

import java.util.Arrays;

public class STRINGANAGRAM
{

	public static void main(String[] args) 
	{
	String s1="Ram";
	String s2="Arm";
	
	s1=s1.toLowerCase();
	s1=s1.toLowerCase();
	
	if(s1.length() != s2.length())
	{
		System.out.println("String Is Not Anagram");
	}
	else
	{
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch1);
		
		
		if(Arrays.equals(ch1, ch2)==true)
		{
			System.out.println("Both String  is Anagram");
		}
	}

	}

}
