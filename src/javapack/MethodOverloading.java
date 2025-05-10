package javapack;

class Calculator {
	public int add(int a , int b , int c) {
		return a + b + c;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public int add(int a , int b) {
		return a+b;
	}
	
	
}

public class MethodOverloading {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int x = calc.add(3, 4, 0);
		System.out.println(x);
		
	}

}
