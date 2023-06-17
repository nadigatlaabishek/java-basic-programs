import java.util.Scanner;
class  Factorial_of_number
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the factorial numbers:.");
		System.out.println("Enter the factorial number.");
		int n=scan.nextInt();
	   int product=1;
		for (int a=1;a<=n;a++ )
		{
		product=product*a;
		}
        System.out.println(" The Factorial of "+n+" is = " +product);
	}
}

