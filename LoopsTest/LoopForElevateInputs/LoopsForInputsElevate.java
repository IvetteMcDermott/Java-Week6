package LoopsTest.LoopForElevateInputs;

public class LoopsForInputsElevate {
    // vars
    private int num1;
    private int num2;
    private int total;
    private int count;

    // constructors
    public LoopsForInputsElevate() {
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
    public void computeLoopsForInputsElevate() {
        total = num1;

        for (count = 1; count < num2; count++) {
            total = total * num1;
        }
    }

    // get
    public int getTotal() {
        return total;
    }

}
