import java.util.Scanner;
class Magicc
{
	public static void main(String[] args) 
	{
		Scanner scan=new  Scanner(System.in);
	System.out.println("To print the magic number");
	System.out.println("Enter a number:");
		int n=scan.nextInt();
		int sum=0;
		while (n>9)
		{
			int ld=0;
			while (n!=0)
			{
				ld=n%10;
				sum=sum+ld;
				n=n/10;
			}
			n=sum;
			sum=0;
		}
		System.out.println(n);
	}
}
