import java.util.Scanner;
class Sum_of_factors_range 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the sum factors ");
		System.out.println("Enter the 1st number");
		int x=scan.nextInt();
	    System.out.println("Enter the last number");
		int y=scan.nextInt();
		int sum=0;
		for (int a=x;a<=y;a++ )
		{
			if (y%a==0)
			{
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}
}
