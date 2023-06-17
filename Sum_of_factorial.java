class  Sum_of_factorial
{
	public static void main(String[] args) 
	{
		long n=5;
	   long product=1;
		for (int a=1;a<=n;a++ )
		{
		product=product*a;

		}
        System.out.println(" The Factorial of "+n+" is = " +product);
	}
}