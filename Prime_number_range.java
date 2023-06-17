class  Prime_number_range
{
	public static void main(String[] args) 
	{

	for (int i=1; i<=100; i++)
	{
			int count=0;
	      	for (int a=1;a<=100 ;a++ )
	   	{
			if (i%a==0)
			{
				count++;
			}
		}
			if (count==2)
			{
				System.out.println(i);
			}
	}
	}
}