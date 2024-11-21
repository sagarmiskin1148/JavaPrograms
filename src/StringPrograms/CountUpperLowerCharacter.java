package StringPrograms;

public class CountUpperLowerCharacter
{

	public static void main(String[] args)
	{
		String str="Welcome TO Automation FRamework";
		
		int Upper=0;
		int Lower=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				Upper++;
			}
			else
			{
				Lower++;
			}
		}
		System.out.println("total Upper Charachters:"+Upper);
		System.out.println("Total Lower Charachters:"+Lower);

	}

}
