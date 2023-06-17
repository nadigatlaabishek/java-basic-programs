import java.util.Scanner;
class  Prime_number_or_not13
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner (System.in);
	System.out.println(" To check the given number is prime or not");
    System.out.println(" Enter the number ");
	int x=scan.nextInt();
	int count=0;
	        	for (int a=1;a<=x ;a++ )
	   	{
			if (x%a==0)
			{
				count++;
			}
		}
			if (count==2)
			{
				System.out.println(x+"  is a  prime number:");
			}
				else
			{
		System.out.println(x+" is not a  prime number: ");
	}	
	}
	}