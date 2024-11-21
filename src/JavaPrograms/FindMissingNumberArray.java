package JavaPrograms;

class FindMissingNumberArray
{
    public static void main(String[] args) 
    {
       int[] numbers=new int[] {1,2,3,4,6,7};
       int total=7;
       
       int expected_sum=total * ((total+1) /2);
       int num_sum=0;
       
       for(int i:numbers)
       {
           num_sum+=i;
       }
       System.out.println(expected_sum - num_sum);
    }
}