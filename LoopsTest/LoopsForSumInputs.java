package LoopsTest;

import java.util.Scanner;

public class LoopsForSumInputs {
    public static void main(String[] args) {
        // open scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int num;
        int sum = 0;
        int count;

        // user input
        for (count = 0; count <= 4; count++) {
            System.out.println("Enter a number:");
            num = sc.nextInt();
            sum = sum + num;
        }

        // output
        System.out.println("\nThe sum of the 5 numbers: " + sum + "\n");

        // close scanner
        sc.close();
    }
}