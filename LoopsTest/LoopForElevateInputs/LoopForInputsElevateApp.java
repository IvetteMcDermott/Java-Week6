package LoopsTest.LoopForElevateInputs;

import java.util.Scanner;

public class LoopForInputsElevateApp {
    public static void main(String[] args) {
        // open scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int num1;
        int num2;
        int total;

        // objects
        LoopsForInputsElevate LFE;
        LFE = new LoopsForInputsElevate();

        // inputs
        System.out.println("\nEnter the base number:");
        num1 = sc.nextInt();
        System.out.println("Enter the power number:");
        num2 = sc.nextInt();

        // set
        LFE.setNum1(num1);
        LFE.setNum2(num2);

        // compute
        LFE.computeLoopsForInputsElevate();

        // get
        total = LFE.getTotal();

        // output
        System.out.println("\n" + num1 + " power by " + num2 + " is " + total + "\n");

        // close scanner
        sc.close();
    }
}
