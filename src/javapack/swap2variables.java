package javapack;

public class swap2variables {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		System.out.println("Value of int x =" + x);
		System.out.println("Value of int y =" + y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("New value of int x=" + x);
		System.out.println("New value of int y=" + y);
		
	}
}
