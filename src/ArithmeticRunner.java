import java.util.Scanner;
public class ArithmeticRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num1 = input.nextInt();
		System.out.println("Okay, enter another.");
		int num2 = input.nextInt();
		Arithmetic answer = new Arithmetic(num1, num2);
		String arithmetic = answer.toArithmetic();
		System.out.println(arithmetic);
		
		
		
	}
}
