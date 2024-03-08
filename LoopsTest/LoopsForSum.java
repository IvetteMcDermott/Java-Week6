package LoopsTest;

public class LoopsForSum {
    public static void main(String[] args) {
        int x = 0;
        for (x = 1; x < 10; x++) {
            x = x + x;
        }
        System.out.println(x);

    }
}
