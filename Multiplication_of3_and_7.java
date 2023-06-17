import java.util.Scanner;
class Multiplication_of3_and_7
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("to print the multiplication factor:..");
		for (int a=3;a<=7 ;a++ )
		{
			           System.out.println(" The factors of "+a+" is.");

			for (int i=1;i<=10 ;i++ )
			{
		System.out.println(+a+" x"+i+" ="+i*a);
			}
	System.out.println("===============");
		}
	}
	}
