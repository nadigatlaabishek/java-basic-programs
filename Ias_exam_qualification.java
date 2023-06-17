import java.util.Scanner;
class Ias_exam_qualification
{
	public static void main(String[] args) 
	{
     Scanner scan=new Scanner(System.in);
	 System.out.println("Eligibility for IAS exam:");
	 System.out.println("Enter the age of person:");
	 int age=scan.nextInt();

		if (age>=21 && age<=32)
		{
			System.out.println("The given person is eligibile for IAS exam:");
		}
		else
		{
			System.out.println("the given person is not eligible for IAS exam:");
		}
	}
}
