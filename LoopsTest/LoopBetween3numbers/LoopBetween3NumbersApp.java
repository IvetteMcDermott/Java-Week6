package LoopsTest.LoopBetween3numbers;

import java.util.Scanner;

public class LoopBetween3NumbersApp {
    public static void main(String[] args) {

        // scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int num1;
        int num2;
        int num3;

        // object
        LoopBetween3Numbers L3N;
        L3N = new LoopBetween3Numbers();

        // inputs
        System.out.println("Enter first the start of the loop:");
        num1 = sc.nextInt();
        System.out.println("Enter first the end of the loop:");
        num2 = sc.nextInt();
        System.out.println("Enter the number of steps for the loop:");
        num3 = sc.nextInt();
        System.out.println(""); // clean line before start the loop print

        // set
        L3N.setNum1(num1);
        L3N.setNum2(num2);
        L3N.setNum3(num3);

        // compute
        L3N.computeLoopBetween3Numbers();

        // get
        L3N.getNum1();

        // output
        System.out.println(""); // clean line after the loop print

        // close scanner
        sc.close();
    }
}