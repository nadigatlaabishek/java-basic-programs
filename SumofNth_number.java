import java.util.Scanner;
class  SumofNth_number
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the numbers sums like calculator");
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		int sum=0;
		for (int a=1;a<=n ;a++ )                                                     //a>0 also used
		{
            System.out.println("Enter a number:"+a);
            int num=scan.nextInt();
			sum=sum+num;
		}
		System.out.println(sum);
	}
}
