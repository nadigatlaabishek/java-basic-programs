import java.util.Scanner;
class  Pattern1
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the awsome pattern....");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("     ");
		System.out.println("Enter how many number of pattern you want print...");
		int n=scan.nextInt();
		for (int i=0; i<=n ;i++ )
		{
			for (int j=0; j<i ;j++ )
			{
		System.out.print("*");
         	}
			System.out.println();
		}

	}
}
