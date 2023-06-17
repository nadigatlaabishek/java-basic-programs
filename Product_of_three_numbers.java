.import java.util.Scanner;
class Product_of_three_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("the product of three numbers are:");
		System.out.println("Enter the first number is:");
		int a=scan.nextInt();
		System.out.println("Enter the secound number is:");
		int b=scan.nextInt();
        System.out.println("Enter the third  number is:");
		int c=scan.nextInt();
		System.out.println("The product of "+a+ " and "+b+" and "+c+" are :"+(a*b*c));
	}
}
