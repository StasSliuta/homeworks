package homework2;

import java.util.Scanner;

public class AreaOfATriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the first side of the triangle ");
        double a = scanner.nextDouble();
        System.out.println("Insert the second side of the triangle");
        double b = scanner.nextDouble();
        System.out.println("Insert the third side of the triangle");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("The area of the triangle is " + s);
        } else {
            System.out.println("The triangle does not exist");
        }

    }

}