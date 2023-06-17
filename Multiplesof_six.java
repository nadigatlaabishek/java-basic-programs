class Multiplesof_six 
{
	public static void main(String[] args) 
	{
		int x=6;
		int sum=0;
		for (int a=1;a<=100 ;a++ )
		{
			if (a%6==0)
			{
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}
}
