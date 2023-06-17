import java.util.Scanner;
class Voting_eligible
{
	public static void main(String[] args) 
	{
     Scanner scan=new Scanner(System.in);
	 System.out.println("Voting eligibility for the given data:");
	 System.out.println("Enter the age of person:");
	 int age=scan.nextInt();

		if (age>=18)
		{
			System.out.println("The given person is eligibile for voting:");
		}
		else
		{
			System.out.println("the given condition is not true:");
		}
	}
}
