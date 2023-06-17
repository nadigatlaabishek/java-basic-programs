class  Strong_number_range 
{
	public static void main(String[] args) 
	{
		System.out.println("To print the strong number range:");
		for (int b=1;b<=50000 ;b++ )
		{
		int n=b;
		int ld=0;
		int temp=n;
		int sum=0;
		while (n!=0)
		{
			ld =n%10;
			int fact=1;
			for (int a=1;a<=ld ;a++ )
			{
				fact=fact*a;
			}
			sum=sum+fact;
			n=n/10;
		}
		n=temp;
		if (sum==n)
		{
			System.out.println(sum);
		}
		}2
	}
}
