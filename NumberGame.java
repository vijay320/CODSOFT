package codesoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void guessNumber(int num) {
        int rnum=num;
        int score=10;
        Scanner sc = new Scanner(System.in);
        int guessNum;
        System.out.println("1. Play again.");
        System.out.println("2. Exit.");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    while (score!=0) {
                        System.out.print("Guess the number : ");
                        guessNum = sc.nextInt();
                        if (guessNum>rnum) {
                            System.out.println("Too high");
                        } else if (guessNum<rnum) {
                            System.out.println("Too low");

                        } else {

                            System.out.println("Correct");
                            System.out.println("Score is " + score);
                            guessNumber(rnum);

                        }
                        score--;
                    }
                    System.out.println("you ansewered wrong multiple times.");
                    guessNumber(rnum);
                case 2:
                    System.out.println("Bye!");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Wrong input");
                    guessNumber(rnum);
            }
        }
    }

    public static void main(String[] args) {
        Random randomNum = new Random();
        int num = randomNum.nextInt(10);
        guessNumber(num);
    }

}
