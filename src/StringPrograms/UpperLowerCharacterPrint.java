package StringPrograms;

public class UpperLowerCharacterPrint 
{

	public static void main(String[] args)
	{
		String str="Welcome TO Automation FRamework";
		
		String Upper="";
		String Lower="";
		
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				Upper=Upper+ch;
			}
			else
			{
				Lower=Lower+ch;
			}
		}
		System.out.println("Upper Charachters:"+Upper);
		System.out.println("Total Upper  Characters:"+Upper.length());
		System.out.println("Lower Charachters:"+Lower);
		System.out.println("Total Lower  Characters:"+Lower.length());
		

	}

}
