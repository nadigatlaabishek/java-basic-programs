class  Magic_pattern7
{
	public static void main(String[] args) 
	{
		System.out.println("To print the magic pattern in 7x7 but the middle is not:");
		for (int i=1;i<=7 ;i++ )
		{
			for (int j=1;j<=7 ;j++ )
			{
				if (i==1||i==7||j==1||j==7)
				{
					System.out.print(" * ");
				}
				else 
				{
					System.out.print("   ");
				}
			}
			System.out.println("");
		}
	}
}
