package javapack;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, key, found = 0;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        key = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = 1;
                break;
            }
        }
        if(found == 0)
            System.out.println("Element not found");
        sc.close();
    }
}
