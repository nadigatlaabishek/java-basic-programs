class  Magic_pattern9
{
	public static void main(String[] args) 
	{
		System.out.println("To print the magic pattern in 7x7 but the middle is not:");
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i==1&&j==5||i==2&&j==4||i==3&&j==3||i==4&&j==2||i==5&& j==1)
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
