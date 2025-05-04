package javapack;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if (score < 0 || score > 100)
            System.out.println("Invalid Score");
        else if (score >= 90)
            System.out.println("Grade: A");
        else if (score >= 80)
            System.out.println("Grade: B");
        else if (score >= 70)
            System.out.println("Grade: C");
        else if (score >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
        sc.close();
    }
}
