import java.util.Scanner;
class Even_number_range
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the Even numbers");
		System.out.println("Enter the natural number from starting number:");
		int n=scan.nextInt();
		System.out.println("Enter the natural number from ending number: ");
		int n1=scan.nextInt();
		for (int a=n;a<=n1 ;a++)
		{
			if (a%2==0 || a%2==0)
			{
			System.out.println(a);
		    continue;
			}
		}
	}
}
