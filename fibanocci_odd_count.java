class fibanocci_odd_count 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		int count=0;
		for (int i=1;i<=10;i++ )
		{
			a=b;
			b=sum;
			sum=a+b;
			if (sum%2==1)
			{
				count++;
			}

		}
		System.out.println(count);
	}
}
