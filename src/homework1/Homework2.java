package homework1;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        double a = i.nextDouble();
        System.out.println(" Enter the second side of the triangle");
        double b = i.nextDouble();
        System.out.println("Enter the the third side of the triangle");
        double c = i.nextDouble();

        if(a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("The area of the triangle is " + s);
        }
        else {
            System.out.println("Triangle does not exist");
        }

    }

}