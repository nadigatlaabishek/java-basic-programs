class Reverse_number1 
{
	public static void main(String[] args) 
	{
		int n=1234;
		int rev=0;
		int last=0;
		while (n!=0)
		{
			last=n%10;
			rev=rev*10+last;
			n=n/10;
		}
		System.out.println(rev);
	}
}
