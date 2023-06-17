class prime_fibanocci 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=100; i++)
	{
			int count=0;
	      	for (int a=1;a<=100 ;a++ )
	   	{
			if (i%a==0)
			{
				count++;
			}
		}
		int a=0;
		int b=1;
		int sum=0;
			if (count==2)
			{
		for (int j=0;j<=10 ;j++ )
		{
		a=b;
		b=sum;
		sum=a+b;
		System.out.println(sum);
		//System.out.println(i);
			}
	    }
	}
	}
}

	/*int a=0;
		int b=1;
		int sum=0;
		for (int i=0;i<=10 ;i++ )
		{
		a=b;
		b=sum;
		sum=a+b;
		System.out.println(sum);
		}*/