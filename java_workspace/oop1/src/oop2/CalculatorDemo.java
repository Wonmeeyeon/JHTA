package oop2;

public class CalculatorDemo {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int result1 = calculator.plus(6, 8);
		double result2 = calculator.plus(6.8, 8.1);
		long result3 = calculator.plus(6000000L, 800000L);
		int result4 = calculator.plus(6, 8, 7);
		
	}

}
