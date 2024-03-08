package week6Lab.GuessingWLoop;

public class GuessingGame {

    // vars
    private int num;
    private String msgF;
    private int pc_num;
    private String msg;
    private String msgL;
    private int i;

    // constructor
    public GuessingGame() {
        num = 0;
        pc_num = 0;

        msg = "";
        msgF = "";
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPcNum(int pc_num) {
        this.pc_num = pc_num;
    }

    // compute
    public void computeGuessG() {
        i = 0;

        while (i < 3) {
            pc_num = (int) (Math.random() * 10) + 1;

            // This line is to test is working proper as we can see the pc_num before
            // ask to input user guess
            System.out.println("pc" + pc_num);

            // starts the number input
            num = (int) GuessingGameInput.GuessNumber();
            // evaluate if guessed or not
            if (num == pc_num) {
                msg = "You guessed!";
                // print the message
                GuessingGameOutput.toPrint(msg);
                // ends the program if guessed
                System.exit(0);
            } else {
                // returns the guess left
                msgL = "Guess left: " + (2 - i);
                GuessingGameOutput.toPrint(msgL);
                // counter for attempts
                i++;
                // final message if reach the max of attempts
                if (i == 2) {
                    msgF = "You Lose! Start over!";
                }
            }
        }
    }

    // get
    public String getMsg() {
        return msg;
    }

    public String getMsgF() {
        return msgF;
    }
}