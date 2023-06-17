import java.util.Scanner;
class Array1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=new int();
		int []a=new int [size];
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println("enter the value:"+i);
			a[i]=sc.nextInt();
		}

	}
}
