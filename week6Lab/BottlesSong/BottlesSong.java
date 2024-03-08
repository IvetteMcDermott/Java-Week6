package week6Lab.BottlesSong;

public class BottlesSong {
    // vars
    private String sing;
    private int count;
    private String line;
    private String msg;

    // constructor
    public BottlesSong() {
        sing = "";
    }

    // set
    public void setSing(String sing) {
        this.sing = sing;
    }

    // compute
    public void computeBottlesSong() {
        if (sing.equalsIgnoreCase("y")) {
            for (count = 99; count > 0; count--) {
                // count = count - 1;
                if (count >= 2) {
                    line = (count
                            + " bottles of beer on the wall, " + count
                            + " bottles of beer \nTake one down and pass it around, " + (count - 1)
                            + " bottles of beer on the wall\n");
                    msg = "";
                    BottlesSongOutput.toPrint(line);
                } else if (count == 1) {
                    line = count + " bottle of beer on the wall, 1 bottle of beer\n" + //
                            "Take one down and pass it around, no more bottles of beer on the wall\n" + //
                            "\nNo more bottles of beer on the wall, no more bottles of beer\n" + //
                            "Go to the store and buy some more, 99 bottles of beer on the wall\n";
                    BottlesSongOutput.toPrint(line);
                    msg = "";
                    break;
                }
            }
        } else if (sing.equalsIgnoreCase("n")) {
            msg = "Oh sad, but when you want come back we will sing!";
        } else {
            msg = "Make your mind up! and pick one :)";
        }
    }

    // get
    public String getLine() {
        return line;
    }

    public String getMsg() {
        return msg;
    }

}