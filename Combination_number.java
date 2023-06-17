import java.util.Scanner;
class  Combination_number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print the Combination  number :");
		System.out.println("Enter a total  number of objects:");
		int n=scan.nextInt();
		System.out.println("Enter a selected  number of objects:");
		int r=scan.nextInt();
		int perm=1;
		int count=1;
		for (int a=n;a>(n-r) ;a-- )
		{
			perm=perm*a;
			count++;
		}
		int dr=1;
		for (int b=1;b<=r ;b++ )
		{
			dr=dr*b;
		}
		int combi=perm/dr;
		System.out.println("combination "+n+" elements of"+r+ "elements is :"+combi);
	}
}
