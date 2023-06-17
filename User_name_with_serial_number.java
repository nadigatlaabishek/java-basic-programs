import java.util.Scanner;
class User_name_with_serial_number 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("To print the user name serial wise:..");
	System.out.println("Enter the user name that i will print:");
	String name=scan.next();
		for (int a=1;a<=20 ;a++ )
		{
			System.out.println(a+")"+name);
		}
	}
}
