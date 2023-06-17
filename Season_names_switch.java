import java.util.Scanner;
class Season_names_switch  
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("To chech the season names:");
		System.out.println("Enter the month number that will print the seasom names:");
		int month=scan.nextInt();
		switch (month)
		{
		case 3: case 4:  case 5:System.out.println("its a summer season");
		break;
		 case 6: case 7:  case 8:System.out.println("its a rainy season");
		break;
		 case 9: case 10:  case 11:System.out.println("its a spring season");
		break;
		case 12 : case 1 : case 2: System.out.println("its a winter season");
	    break;
		default :System.out.println("Enter the valid month number");
		}
	}
}
