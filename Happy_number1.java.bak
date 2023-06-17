import java.util.Scanner;
class  Happy_number1
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the happy number");
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		int sum=0;
		int last=0;
		while (num!=0||sum>9)
		{
			if (num==0)
			{
				num=sum;
				sum=0;
			}
			last=num%10;
			sum=sum+(last*last);
			num=num/10;
		}
		if (sum==1)
		{
			System.out.println("It is a happy number:");
		}
		else
		{
			System.out.println("It is not a happy number:");
		
		}
	}
}
