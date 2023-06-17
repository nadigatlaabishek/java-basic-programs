import java.util.Scanner;
class technumber1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("checking the number tech number or not");
		System.out.println("Enter the number");
		int number=scan.nextInt();
		int first=0;
		int secound=0;
		int sum=0;
		int sqrt=0;
		first=number/100;
		secound=number%100;
		sum=first+secound;
		sqrt=sum*sum;
		if (sqrt==number)
		{
			System.out.println(number+" the given number is tech number ");
		}
		else
		{
			System.out.println(number+" the given number is not a tech number");
		}
	}
}
