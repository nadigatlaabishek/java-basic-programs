import java.util.Scanner;
class  Strong_number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the strong number:");
		System.out.println("Enter the number:");
		int n=scan.nextInt();
		int ld=0;
		int temp=n;
		int sum=0;
		while (n!=0)
		{
			ld =n%10;
			int fact=1;
			for (int a=1;a<=ld ;a++ )
			{
				fact=fact*a;
			}
			sum=sum+fact;
			n=n/10;
		}
		n=temp;
		if (sum==n)
		{
			System.out.println("It is a strong number:");
		}
		else
		{
			System.out.println("It is not a strong number:");
		}
	}
}
