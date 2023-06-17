import java.util.Scanner;
class  Count_the_digits1
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print and Count the number of digits ");
	    System.out.println("Enter the number: ");
		int num=scan.nextInt();
		int count=0;
		int temp=num;
        while (num!=0)
        {
			count++;
			num=num/10;
        }
		System.out.println("the number of digits in the "+temp+ " is:"+count);
	}
}
