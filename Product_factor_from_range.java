import java.util.Scanner;
class  Product_factor_from_range
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print product of factor of range:.");
		System.out.println("Enter the min range:.");
		int x=scan.nextInt();
		System.out.println("Enter the max range:.");
		int y=scan.nextInt();
		for (int a=x;a<=y;a++ )
		{
	if (y%a==0)
	{
	
        System.out.println(a);
	}
		}
		}
}

