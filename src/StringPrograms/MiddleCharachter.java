
package StringPrograms;
public class MiddleCharachter
{
    public static void main(String[] args)
    {
        String str="BRAMHADEV";
        
        int len=str.length();
        System.out.println(len);
        
        int middle=len/2;
        
        if(len%2==0)
        {
            System.out.println(str.charAt(middle-1));
        }
        else
        {
            System.out.println(str.charAt(middle));
        }
    }
}