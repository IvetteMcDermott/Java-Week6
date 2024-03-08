package LoopsTest;

public class LoopsForSumEvenOdd {
    public static void main(String[] args) {
        int x = 0;
        int xO = 0;
        int xE = 0;

        for (x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                xO = xO + x;
            } else {
                xE = xE + x;
            }
            // x = x + x;
        }
        System.out.println("\nEven: " + xE);
        System.out.println("\nOdd: " + xO);
    }
}
