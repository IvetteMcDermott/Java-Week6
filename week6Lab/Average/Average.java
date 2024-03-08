package week6Lab.Average;

// import java.util.Scanner;

public class Average {
    // scanner
    // Scanner sc = new Scanner(System.in);

    // vars
    private int qtySubject;
    private double grade;
    private double grades;
    private double average;
    private String averageL;

    // constructor

    // set
    public void setQtySubject(int qtySubject) {
        this.qtySubject = qtySubject;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    // compute
    // for numeric grades
    public void computeAverage() {
        average = grades / qtySubject;
    }

    // for alpha grades
    public void computeAverageL() {
        averageL = AverageLetterInput.gradeValueL(average);

    }

    // get
    public double getAverage() {
        return average;
    }

    public String getAverageL() {
        return averageL;
    }

}
