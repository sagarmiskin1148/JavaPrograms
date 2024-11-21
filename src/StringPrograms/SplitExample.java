package StringPrograms;

public class SplitExample
{  
public static void main(String args[])
{  
String s1="java Testing Selenium Maven";  
String[] words=s1.split("\\s");   

for(String w:words)
{  
System.out.println(w);  
}  
}
    
}  