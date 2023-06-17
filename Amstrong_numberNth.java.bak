import java.util.Scanner;
class Amstrong_numberNth 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("TO print the amstron number or not:");
		System.out.println("Enter number:");
		int n=scan.nextInt();
		int x=1;
		int count1=1;
		while (count1<=n)
		{
			int count=0;
			int temp=x;
			while (x!=0)
			{
			count++;
			x=x/10;
			}
	        x=temp;
		    int ld=0;
		    int sum=0;
            while (x!=0)
            {
			ld=x%10;
			int exp=1;
			for (int a=1;a<=count ;a++ )
			{
			exp=exp*ld;
			}
			sum=sum+exp;
			x=x/10;
	         }
			x=temp;
			if (x==sum)
			{
		    if (count1==n)
		    {
			System.out.println(x);
			}
			count++;
			}
       	x++;
		}
		}
}
