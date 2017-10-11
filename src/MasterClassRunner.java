import java.util.Scanner;
public class MasterClassRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num1 = input.nextInt();
		System.out.println("Okay, enter another.");
		int num2 = input.nextInt();
		MasterClass answer = new MasterClass(num1, num2);
		String arithmetic = answer.toArithmetic();
		String comparingIntegers = answer.toCompare();
		String multiples = answer.toMultiple();
		String oddOrEven = answer.toRemainder();
		System.out.println(arithmetic);
		System.out.println(comparingIntegers);
		System.out.println(multiples);
		System.out.println(oddOrEven);
		
	}
}
