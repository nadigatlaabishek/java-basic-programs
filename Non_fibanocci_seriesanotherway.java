class Non_fibanocci_seriesanotherway 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=0;i<=100 ;i++ )
		{
			if (i==sum)
			{
	        sum=a+b;
			 a=b;
			b=sum;
			}
			else
			{
		System.out.println(i);
	}
		}
	}	
}
