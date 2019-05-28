
public class Multiplication {
	/***
	 * recursively defined multiplation method
	 * @param int1
	 * @param int2
	 * @return product of n1 and n2
	 */
	public static int Multiply (int int1, int int2)
	{
		//identify the base case
		if(int2 ==0)
			return 0;
		return int1 + Multiply(int1, int2-1);
	}
	
	public static int fibonacci(int n)
	{
		if (n <= 2)
			return 1;
		return fibonacci(n-2) + fibonacci(n-1);
	}
	
	public static int intDiv(int n1, int n2)
	{
		if (n2 > n1)
			return 0;
		return 1 + intDiv(n1 - n2, n2);
	}
	public static int factorial(int n1)
	{
		if (n1 == 0)
		{
			return 1;
		}
		return n1 * factorial(n1 -1);
	}
	public static void main(String[]args)
	{
		System.out.println(Multiply(5,6));
		System.out.println(fibonacci(5));
		System.out.println(factorial(3));
	}
	


	
}