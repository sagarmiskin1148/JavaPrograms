package StringPrograms;

public class SwappingTwoString
{

	public static void main(String[] args)
	{
		String a="hello";
        String b="world";
        
        System.out.println(a+" "+b);
        
        a=a+b;
        
        b=a.substring(0,a.length() - b.length());
        
        a=a.substring(b.length());
        
        System.out.println("String after swap:"+a+" "+b);

	}

}
