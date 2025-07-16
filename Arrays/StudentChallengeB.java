// SEARCHING AN ELEMENT

import java.util.Scanner;

public class StudentChallengeB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };

        int key;

        System.out.println("Enter the element to search: ");

        key = sc.nextInt();

        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) {
                System.out.println("Element found at index: " + i);
                System.exit(0);
            }
        }
        System.out.println("Element not found in the array.");

    }
}
