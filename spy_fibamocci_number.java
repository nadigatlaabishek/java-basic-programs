class spy_fibamocci_number
{
	public static void main(String[] args) 
	{
		for (int i=1;i<= ;i++ )
		{
			int n=i;
			int sum=0;
			int ld=0;
			int prod=1;
			while (n!=0)
			{
				ld=n%10;
				sum=sum+ld;
				prod=prod*ld;
				n=n/10;
			}
			if (sum==prod)
			{
				int a=0;
				int b=1;
				int add=0;
				for (int j=1;j<=i ;j++ )
				{
			     a=b;
				 b=add;
				add=a+b;
				}
				System.out.println(add);
			}
		}
	}
}
