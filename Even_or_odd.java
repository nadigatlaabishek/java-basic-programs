import java.util.Scanner;
class Even_or_odd
{
	public static void main(String[] args) 
	{
     Scanner scan=new Scanner(System.in);
	 System.out.println("To check the given number is Even or odd:");
	 System.out.println("enter the number and you want to print:");
	 int number=scan.nextInt();

		if (number%2==0)
		{
			System.out.println("The given number is Even number :");
		}
		else
		{
			System.out.println("the given number is Odd number:");
		}
	}
}
