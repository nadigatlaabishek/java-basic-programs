import java.util.Scanner;
class  Fibanocci_Nth_i
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("To print the Fibanocci series from the given range:");
		System.out.println("Enter the n value:");
		int n=scan.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			a=b;
			b=sum;
			sum=a+b;
			{
		if (i==n)
		{
			System.out.println(sum);
		}
			}
		}
	}
}
