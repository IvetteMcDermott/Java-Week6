package LoopsTest.LoopBetween2numbers;

public class Loop2numbers {
    // vars
    private int num1;
    private int num2;
    private int count;

    // constructors
    public Loop2numbers() {
        num1 = 0;
        num2 = 0;
        count = 0;
    }

    // set
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // compute
    public void computeLoop2Numbers() {
        for (count = num1; num1 <= num2; num1++) {
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

    public int getCount() {
        return count;
    }

}
