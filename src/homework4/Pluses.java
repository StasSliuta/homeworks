package homework4;

import java.util.Scanner;
public class Pluses {
    public static void Rectangle(int a, int b) {
        String m = " ";
        String spaces = new String(new char[a - 2]).replace("\0", m);
        for (int i = 0; i < a; i++)
            System.out.print("+");
        System.out.println();
        for (int j = 0; j < (b - 2); j++)
            System.out.println("+" + spaces + "+");
        for (int i = 0; i < a; i++)
            System.out.print("+");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the width of the rectangle: ");
        int a = sc.nextInt();
        System.out.println("Input the height of the rectangle: ");
        int b = sc.nextInt();
        Rectangle(a, b);
    }
}