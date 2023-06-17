class	Spy_number
{
	public static void main(String[] args) 
	{
		System.out.println("To check wether the given number is spy or not:... ");
		int num=123;
		int sum=0;
		int last=0;
		int product=1;
        while (num!=0)
        {
			last=num%10;
			sum=sum+last;
			product=product*last;
            num=num/10;
        }
		if (sum==product)
		{
			System.out.println("It is a spy number:");
		}
		else
		{
			System.out.println("It is not a spy number");
		}
	}
}
