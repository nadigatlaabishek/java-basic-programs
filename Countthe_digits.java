import java.util.Scanner;
class  Countsthe_digits
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print and Count the number of digits ");
	    System.out.println("Enter the number: ");
		int num=scan.nextInt();
		int count=0;
		int temp=num;
       for (int a=num; a!=0 ;a=a/10 )
        {
			count++;
        }
		System.out.println("the number of digits in the "+temp+ " is:"+num);
	}
}