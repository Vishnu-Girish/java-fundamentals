package javapack;
import java.util.*;


public class numbersequalitycheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2 :");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("The numbers are equal");
		}
		else {
			System.out.println("The numbers are not equal");
		}
		sc.close();
		
	}
}
