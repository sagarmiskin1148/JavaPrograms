package JavaPrograms;

public class SecondLargestNumber 
{

	public static void main(String[] args) 
	{
		int[] a= {2,4,6,3,8,7,9,12,15,17,24,19,20};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
	}

}
