package StringPrograms;

public class ReverseString 
{

	public static void main(String[] args)
	{
		
		String str="Hellow World";
		int leng=str.length();
		String rev="";
		
		for(int i=leng-1; i>=0;i--)
		{
		
		rev=rev+str.charAt(i);
		
		System.out.println(rev);
			
		
		}

	}

}
