class  Nth_magic1
{
	public static void main(String[] args) 
	{
		int n=2;
		int count=1;
		int x=1;
		while (count<=n)
		{
			int num=x;
			if (num%9==1)
			{
				if (count==n)
				{
		System.out.println(x);
	}
	count++;
			}
			x++;
		}
	}
}
