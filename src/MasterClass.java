
public class MasterClass 
{
	private int num1;
	private int num2;
	public MasterClass()
	{
		num1 = 0;
		num2 = 0;
	}
	public MasterClass(int num1, int num2)
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
	public String toCompare()
	{
		String answer = "";
		if (num1 > num2)
		System.out.println(num1 + " is bigger.");
		else if (num1 < num2)
		System.out.println(num2 + " is bigger.");
		else
		System.out.println("These numbers are equal.");
		return answer;
	}
	public String toMultiple()
	{
		String answer = "";
		double remainder = num1 % num2;
		if (remainder == 0)
		{
			answer = num2 + " is a multiple of " + num1;
		}
		else
		{
			answer = num2 + " is not a multiple of " + num1;
		}
		return answer;
	}
	public String toRemainder()
	 {
		 String answer = "";
		 int remainder = num1 % 2;
		 
		 if (remainder == 0)
		 {
			 answer = "This number is even.";
		 }
		 else
		 {
			 answer = "This number is odd.";
		 }
		 return answer;
	 }
}
