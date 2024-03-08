package week6Lab.GuessingWLoop;

import javax.swing.JOptionPane;

public class GuessingGameapp {

    public static void main(String[] args) {
        // variables
        int num;
        String msg;
        String msgF;

        // objects
        GuessingGame GG;
        GG = new GuessingGame();

        // Start input
        JOptionPane.showMessageDialog(null, "Ready to play?");

        // Initialize variables
        num = 0;
        msgF = "";

        // set
        GG.setNum(num);

        // compute
        GG.computeGuessG();

        // get
        msg = GG.getMsg();
        msgF = GG.getMsgF();

        // output
        if (msg == "") {
            GuessingGameOutput.toPrint(msgF);
        } else {
            GuessingGameOutput.toPrint(msg);
        }
    }
}
