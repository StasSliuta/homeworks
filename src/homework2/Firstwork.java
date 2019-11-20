package homework2;

import java.util.Scanner;

public class Firstwork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number");
        String a = scanner.next();
        System.out.println("Your numbers: ");
        int n  = a.length();

        for (int i = 0; i < n; i++)
            System.out.println(a.charAt(i));
    }
}