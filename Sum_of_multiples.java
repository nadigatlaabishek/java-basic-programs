class  Sum_of_multiples
{
	public static void main(String[] args) 
	{
		int x=6;
		int sum=0;
		for (int a=1;a<=100;a++ )
		{
			if (a%x==0)
			{
	sum=sum+a;
		}
	}
		System.out.println("The sum of multiples of  "+x+ " is = "+sum);
	}
}
