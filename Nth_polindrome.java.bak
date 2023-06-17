import java.util.Scanner;
class  Nth_polindrome
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the Nth polindrome:");
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int y=1;
		for (int i=1;i<=1000 ;i++ )
		{
			int rev=0;
			for (int a=i;a!=0 ;a=a/10 )
			{
				rev=rev*10+i%10;
			}
			if (rev==i)
			{ 
				if (y==n)
				{
		        System.out.println(y+")  "+i);
				}
	             y++;
			}
		}
	}
}