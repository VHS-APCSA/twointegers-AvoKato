
public class ComparingIntegers
{
	public int num1;
	public int num2;
	public ComparingIntegers()
	{
		num1 = 0;
		num2 = 0;
	}
	public ComparingIntegers(int num1, int num2)
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
}
