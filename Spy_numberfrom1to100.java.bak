import java.util.Scanner;
class	Spy_numberfrom1to100
{
	public static void main(String[] args) 
	{
		Scanner scan=new  Scanner(System.in);
		System.out.println("To print the spy numbers  from 1 to 1000 ");
		for (int i=1;i<=1000 ;i++ )
		{
		int num=123;
		int sum=0;
		int last=0;
		int product=1;
		int temp=i;
        while (i!=0)
        {
			last=i%10;
			sum=sum+last;
			product=product*last;
            i=i/10;
        }
		i=temp;
		if (sum==product)
		{
			System.out.println(i);
		}
		}
	}
}