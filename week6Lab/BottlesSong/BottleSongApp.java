package week6Lab.BottlesSong;

import java.util.Scanner;

public class BottleSongApp {
    public static void main(String[] args) {

        // open scanner
        Scanner sc = new Scanner(System.in);

        // vars
        String sing;
        String line;
        String msg;

        // object
        BottlesSong BS;
        BS = new BottlesSong();

        // input
        System.out.println("Start: (Y or N)");
        sing = sc.nextLine();

        // set
        BS.setSing(sing);

        // compute
        BS.computeBottlesSong();

        // get
        line = BS.getLine();
        msg = BS.getMsg();

        // output
        if (line == null) {
        } else {
            BottlesSongOutput.toPrint(line);
        }
        BottlesSongOutput.toPrint(msg);

        sc.close();
    }
}