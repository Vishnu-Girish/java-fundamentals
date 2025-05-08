package javapack;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, sum = 0;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }
        System.out.println("Sum of even numbers = " + sum);
        sc.close();
    }
}
