package homework2;

import java.util.Scanner;

public class Circumference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius:");

        double r = scanner.nextDouble();
        double i = 2 * Math.PI * r;

        System.out.println("Circumference: " + i);
    }
}
