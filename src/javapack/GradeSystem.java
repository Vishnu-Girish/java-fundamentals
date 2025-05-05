package javapack;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student score (0 to 100): ");
        int score = sc.nextInt();
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        // Switch case for comments
        switch (grade) {
            case 'A':
                System.out.println("Excellent work!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Fair effort.");
                break;
            case 'D':
                System.out.println("Needs improvement.");
                break;
            case 'F':
                System.out.println("Failed. Better luck next time!");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
