package javapack;
import java.util.*;

public class checkpositivenegative {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check:");
		int m = sc.nextInt();
		if (m>=0) {
			System.out.println("It is a positive number");
		}
		else {
			System.out.println("It is a negative number");
		}
		sc.close();
		
	}

}
