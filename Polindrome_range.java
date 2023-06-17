class  Polindrome_range
{
	public static void main(String[] args) 
	{
		int y=1;
		for (int i=1;i<=1000 ;i++ )
		{
			int rev=0;
			for (int a=i;a!=0 ;a=a/10 )
			{
				rev=rev*10+i%10;
			}
			if (rev==i)
			{
		System.out.println(y+")  "+i);
	    y++;
			}
		}


	}
}
