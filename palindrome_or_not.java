class  palindrome_or_not
{
	public static void main(String[] args) 
	{
		int n=22;
		int rev=0;
		for (int a=n;a!=0 ;a=a/10 )
		{
			rev=rev*10+a%10;
		}
		if (rev==n)
		{
		System.out.println(n+ " is a palindrome number");
	}
	else
		System.out.println(n+ " it is not a palindrome number" );
}
}
