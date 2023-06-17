import java.util.Scanner;
class Exponential_value1
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(" To print the exponential values:.");
		System.out.println(" Eneter the base number.");
		int base=scan.nextInt();
		System.out.println("Enter the power value.");
		int power=scan.nextInt();
		int exp=1;
		for (int a=1;a<=power ;a++ )
		{
			exp=exp*base;
		}
		System.out.println(exp);
	}
}
