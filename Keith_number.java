import java.util.Scanner;
class  Keith_number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the keith number or not:");
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		int temp=n;
		int c=n%10;
		n=n/10;
		int b=n%10;
		n=n/10;
		int a=n%10;
		n=n/10;
		int sum=0;
		for (int i=1;sum<temp ;i++ )
		{
			sum=a+b+c;
			a=b;
			b=c;
			c=sum;
		}
		if (sum==temp)
		{
			System.out.println("The given number is keith number:");
		}
		else
		{
			System.out.println("The given number is not a keith number:");
		}
	}
}
