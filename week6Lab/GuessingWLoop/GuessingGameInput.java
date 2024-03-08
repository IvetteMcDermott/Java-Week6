package week6Lab.GuessingWLoop;

import javax.swing.JOptionPane;

public class GuessingGameInput {

    public static int GuessNumber() {

        String input;
        int num;

        num = 0;

        // takes a String so to validate that is not empty entry
        input = JOptionPane.showInputDialog(null, "Guess what number I got? From 1 to 10");
        // validates not empty or null value is enter
        if (input != null && !input.isEmpty()) {
            // pass the input to int
            num = Integer.parseInt(input);
            // validates the value is in range
            if (num < 1 || num > 10) {
                JOptionPane.showMessageDialog(null, "Invalid input! Your lost!");
            }
        } else {
            // if its empty gives a message
            JOptionPane.showMessageDialog(null, "Input can not be empty!");
        }
        return num;
    }
}
