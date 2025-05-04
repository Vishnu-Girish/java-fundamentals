package javapack;
import java.util.*;

public class maxofthree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter second number:");
		int n2 = sc.nextInt();
		System.out.println("Enter third number:");
		int n3 = sc.nextInt();
		int max = n1;
		if (n2>max) {
			max = n2;
		}
		if (n3>max) {
			max = n3;
		}
		System.out.println("The greatest of the three is:" + max);
		sc.close();
	}

}
