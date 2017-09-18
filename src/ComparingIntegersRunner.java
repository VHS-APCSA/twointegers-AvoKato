import java.util.Scanner;
public class ComparingIntegersRunner
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num1 = input.nextInt();
		System.out.println("Good, now enter another.");
		int num2 = input.nextInt();
		ComparingIntegers answer = new ComparingIntegers(num1, num2);
		String comparingIntegers = answer.toCompare();
		System.out.println(comparingIntegers);
	}
}
