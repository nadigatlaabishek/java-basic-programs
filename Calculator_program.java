import java.util.Scanner;
class Calculator_program
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the calucator:");
		int sum=0;
		int prod=1;
		int mod=0;
		int div=0;
		int sub=0;
	   	for (int a=1;true ;a++ )
		{
			int n=scan.nextInt();
			char ch=scan.next().charAt(0);
			if (ch=='+')
			{

				sum=sum+n;
			}
			else if (ch=='=')
			{
				System.out.println(sum=sum+n);
				break;
			}
		}
	}
}
