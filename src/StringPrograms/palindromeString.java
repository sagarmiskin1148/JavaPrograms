package StringPrograms;

public class palindromeString
{

	public static void main(String[] args)
	{
		String str="Radar";
		
		str=str.toLowerCase();
		
		boolean value=true;
		
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
			{
				value=false;
			}
		}
		if(value)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
