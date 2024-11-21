package StringPrograms;

public class ReverseStringAndpalindrome 
{

	public static void main(String[] args) 
	{
	  String str="SAGAR";
	  String rev="";
	  
	  char ch;
	  
	  for(int i=0;i<str.length();i++)
	  {
		  ch=str.charAt(i);
		  rev=ch+rev;
	  }
	  System.out.println(rev);
	  
	  boolean b1=str.equals(rev);
	  {
		  if(b1==true)
		  {
			  System.out.println("String is palindrome");
		  }
		  else
		  {
			  System.out.println("String is not palindrome");
		  }
	  }
	}

}
