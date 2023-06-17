import java.util.Scanner;
class  Product_of_natural_numbers_range
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
       System.out.println(" To print the product of natural numbers:.");
      System.out.println(" Enetr the min range;.. ");
	  int x=scan.nextInt();
        System.out.println(" Enetr the mix range;.. ");
	  int y=scan.nextInt();
	   long  product=1;
		for (int a=x;a<=y ;a++ )
		{
			product=product*a;
		}
        System.out.println(" The product of natural numbers range from "+x+"  to "+y+" is = "+product);
	}
}

