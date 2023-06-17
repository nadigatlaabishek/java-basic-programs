import java.util.Scanner;
class  Permutations_number 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To print thepermutation number or not :");
		System.out.println("Enter a total  number of objects:");
		int n=scan.nextInt();
		System.out.println("Enter aselected  number of objects:");
		int r=scan.nextInt();
		int perm=1;
		int count=1;
		for (int a=n;a>(n-r) ;a-- )
		{
			perm=perm*a;
			count++;
		}
		System.out.println("permutation "+r+" elements out of "+n+" elements is :"+perm);
	}
}
