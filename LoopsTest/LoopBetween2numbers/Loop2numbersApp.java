package LoopsTest.LoopBetween2numbers;

import java.util.Scanner;

public class Loop2numbersApp {
    public static void main(String[] args) {
        // open scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int num1;
        int num2;
        // int count;

        // object
        Loop2numbers L2N;
        L2N = new Loop2numbers();

        // user input
        System.out.println("Enter a number for start the loop:");
        num1 = sc.nextInt();
        System.out.println("Enter a number for end the loop:");
        num2 = sc.nextInt();
        System.out.println("");

        // set
        L2N.setNum1(num1);
        L2N.setNum2(num2);

        // compute
        L2N.computeLoop2Numbers();

        // get
        // L2N.getNum1();

        // output
        // System.out.println(num1);

        // clear line at the end of the prints
        System.out.println("");

        // close scanner
        sc.close();

    }

}
