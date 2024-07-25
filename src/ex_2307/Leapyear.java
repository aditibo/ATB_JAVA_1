package ex_2307;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if it is leap year or not");
        int year = sc.nextInt();
                if (year%4==0)
                    System.out.println("It is leap year");
                else
                    System.out.println("It is not a leap year");
    }
}
