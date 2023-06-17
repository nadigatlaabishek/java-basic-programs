import java.util.Scanner;
class  Sum_of_natural_number_range 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the sum of natural numbers:");
		System.out.println("Enetr the min range:");
		int x=scan.nextInt();
		Sytem.out.println("Enter the max range:");
		int y=scan.nextInt();
		int sum=0;
		for (int a=x;a<=y ;a++ )
		{
	sum=sum+a;
		}
		System.out.println(sum);
	}
}
