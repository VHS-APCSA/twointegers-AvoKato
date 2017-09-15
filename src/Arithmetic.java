
public class Arithmetic 
{
	private int num1;
	private int num2;
	public Arithmetic()
	{
		num1 = 0;
		num2 = 0;
	}
	public Arithmetic(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	public String toArithmetic()
	{
		String answer = "";
		double quotient = (double)num1 / num2;
		int product = num1 * num2;
		int sum = num1 + num2;
		int difference = num1 - num2;
		answer = "The sum is " + sum + ", the difference is " + difference + ", the product is " + product + ", and the quotient is " + quotient;
		return answer;
	}
}
