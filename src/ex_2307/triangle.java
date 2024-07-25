package ex_2307;

import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 Sides of triangle and I will let you know if triangle is equilateral or isosceles or scalene");
        System.out.println("Enter side 1: ");
        int side1 = sc.nextInt();
        System.out.println("Enter side 2: ");
        int side2=sc.nextInt();
        System.out.println("Enter side 3: ");
        int side3=sc.nextInt();

        if(side1==side2 && side1==side3){
            System.out.println("It is a equilateral triangle");
        }
        else if(side1!=side2 && side1!=side3)
        {
            System.out.println("It is a scalene triangle");
        }
        else{
            System.out.println("It is a isosceles triangle");
        }
    }



}
