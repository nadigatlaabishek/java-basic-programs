import java.util.Scanner;
class  Largestof5_number
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the largest of a given five number:");
		System.out.println("Enter the five number:");
		int large=0;
		for (int a=1;a<=5 ;a++ )
		{
			int n= scan.nextInt();
			if (n>large)
			{
				large=n;
			}
		}
		System.out.println(large+" is a large number");
	}
}
