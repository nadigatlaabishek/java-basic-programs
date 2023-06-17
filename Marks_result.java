import java.util.Scanner;
class Marks_result
{
	public static void main(String[] args) 
	{
	 Scanner scan=new Scanner(System.in);
		System.out.println("To print the Grade result for students:");
		System.out.println("Enter the marks you want to print:");
		int marks=scan.nextInt();
		if (marks>=90 && marks<=100)
		{
			System.out.println("Student got a  first rank:");
		}
			else if (marks>=80 && marks<=89)
			{
				System.out.println("Student got a secound rank: ");
			}
			else if (marks>=70 && marks<=79)
			{
				System.out.println("Student got a first class:");
			}
			else if (marks>=60 && marks<=69)
			{
				System.out.println(" The student get a secound class:");
			}
			else if (marks>=30 && marks<=59)
			{
				System.out.println("The student get passed:");
				}
			else if (marks>=0 && marks<=30)
			{
				System.out.println("The student Failed for the exam:");
			}
			else 
		{
			System.out.println("Enter the corrrect input to find the grade for the student:");
			}
	}
}
