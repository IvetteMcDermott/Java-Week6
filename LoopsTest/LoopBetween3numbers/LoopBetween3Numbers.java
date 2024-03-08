package LoopsTest.LoopBetween3numbers;

public class LoopBetween3Numbers {
    // vars
    private int num1;
    private int num2;
    private int num3;
    private int count;

    // constructor
    public LoopBetween3Numbers() {
        num1 = 0;
        num2 = 0;
        num3 = 0;
        count = 0;
    }

    // set
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    // compute
    public void computeLoopBetween3Numbers() {
        for (count = num1; num1 <= num2; num1 = num1 + num3) {
            System.out.println(num1);
        }

    }

    // get
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

}
