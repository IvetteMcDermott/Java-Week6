package week6Lab.Average;

import java.util.Scanner;

public class AverageApp {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // vars
        int qtySubject;
        double grade;
        double grades;
        double average;

        // object
        Average Ave;
        Ave = new Average();

        // input

        System.err.println("How many subjects: ");
        qtySubject = sc.nextInt();
        grades = 0;

        for (int x = 1; x <= qtySubject; x++) {
            System.out.println("Enter the grade: ");
            grade = sc.nextInt();
            grades = grades + grade;
        }

        // set
        Ave.setQtySubject(qtySubject);
        Ave.setGrades(grades);

        // compute
        Ave.computeAverage();

        // get
        average = Ave.getAverage();

        // output
        System.out.println("\nThe average of your grades is: " + String.format("%.2f", average) + "\n");

        sc.close();
    }

}
