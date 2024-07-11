public class Calculator {
    int sum(int... numbers)
	{
		int total = 0;
		for (int num : numbers)
		{
			total += num;
		}
		return total;
	}
 
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		System.out.println("Sum of 3 Numbers : " + calc.sum(1, 2, 3));
		System.out.println("Sum of 4 Numbers : " + calc.sum(10, 20, 30, 40, 50));
	}
}
