package javapack;
import java.util.*;

public class adddetailstosentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter you favourite sport:");
		String sport = sc.next();
		System.out.println("My name is " + name + " and my age is " + age +". My favorite sport is " + sport);
		sc.close();
	}

}
