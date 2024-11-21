package StringPrograms;

public class FindOwels
{
    public static void main(String[] args)
    {
        String str="wellcome to java program";
        
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                System.out.println(str.charAt(i));
            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                System.out.println("it is a consonants");
            }
        }
    }
}