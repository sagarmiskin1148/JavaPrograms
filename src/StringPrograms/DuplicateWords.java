package StringPrograms;

public class DuplicateWords 
{

	public static void main(String[] args)
	{
	  String str="JAVA AUTOMATION MANUAL JAVA MANUAL";
	  
	  int count;
	  
	  str=str.toLowerCase();
	  
	  String[] ch=str.split(" ");
	  
	  for(int i=0;i<ch.length;i++)
	  {
		  count=1;
		  
		  for(int j=i+1;j<ch.length;j++)
		  {
			  if(ch[i].equals(ch[j]))
			  {
				  count++;
				  
				  ch[j]="0";
			  }
		  }
		  if(count>1 && ch[i] !="0")
		  {
			  System.out.println(ch[i]);
		  }
	  }

	}

}
