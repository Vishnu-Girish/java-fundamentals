package javapack;

import java.util.Scanner;

public class voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean isCitizen = sc.nextBoolean();
        if (age >= 18 && isCitizen)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
        sc.close();
    }
}
