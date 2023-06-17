import java.util.Scanner;
class Sum_of_factors 
{
	public static void main(String[] args) 
	{
		int x=12
		int sum=0;
		for (int a=1;a<=x;a++ )
		{
			if (x%a==0)
			{
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}
}
