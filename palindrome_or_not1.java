class  polindrome_or_not1
{
	public static void main(String[] args) 
	{
		int n=21	;
		int rev=0;
		int rem=0;
		int temp=n;
		while (temp!=0)
		{
        rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;

		}
		if (rev==n)
		{
		System.out.println(n+ " is a palindrome number");
	}
	else
		System.out.println(n+ " it is not a palindrome number" );
}
}
