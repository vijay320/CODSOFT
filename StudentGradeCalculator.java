package codesoft;

import java.util.Scanner;

public class StudentGradeCalculator {
    static int marks=500;
    static int totalMarks = 0;
    static int avgPer = 0;
    static String grade = "fail";

    public static void marksCalc(int s1, int s2, int s3, int s4, int s5) {
        totalMarks = s1 + s2 + s3 + s4 + s5;
    }

    public static void avgPercentage() {
        avgPer = (totalMarks / marks)*100;
    }

    public static void gradeCalc() {
        if (avgPer < 30) {
            System.out.println("Fail");
        } else if (avgPer < 50 && avgPer > 30) {
             grade = "C";
        } else if (avgPer < 70 && avgPer > 50) {
            grade = "B";
        } else if (avgPer > 90) {
            grade = "A";
        } else {
            grade = "S";
        }
    }

    public static void displayResult() {
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average percentage: " + avgPer);
        System.out.println("Grade: " + grade);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of hindi : ");
        int hindi = sc.nextInt();
        System.out.print("Enter marks of english : ");
        int english = sc.nextInt();
        System.out.print("Enter marks of science : ");
        int science = sc.nextInt();
        System.out.print("Enter marks of math : ");
        int math = sc.nextInt();
        System.out.print("Enter marks of account : ");
        int account = sc.nextInt();

        marksCalc(hindi, english, science, math, account);
        avgPercentage();
        gradeCalc();
        displayResult();
    }
}
