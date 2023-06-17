impoer java.util.Scanner;
class large_small-number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		for (int i=1;i<=5 ;i++ )
		{
			int l=0;
			int s=0;
		int n=scan.nextInt();
		if (n>l && n<s)
		{
			l=n;
			s=n;
		   }
		 }
		System.out.println(l);
		System.out.println(s);
	}
}
