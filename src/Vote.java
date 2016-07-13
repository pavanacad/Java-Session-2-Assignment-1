import java.util.Scanner;

public class Vote {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the age: ");
		Scanner AG = new Scanner(System.in);
		int Age = AG.nextInt();
		if(Age>=18)
		{
			System.out.println("You are Eligible for voting");
		}
		else
		{
			System.out.println("You are not Eligible for Voting");
		}
	}

}
