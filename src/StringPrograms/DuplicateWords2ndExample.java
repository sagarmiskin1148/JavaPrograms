package StringPrograms;

public class DuplicateWords2ndExample 
{

	public static void main(String[] args)
	{
		String str="JAVA AUTOMATION MANUAL JAVA AUTOMATION";
		
		String[] a=str.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}
