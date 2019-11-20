package homework4;

import java.util.Scanner;
public class NumberS {
    private static int Calculation(String text) {
        text = text.trim();
        String[] words = text.split(" ");
        return words.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = sc.nextLine();
        System.out.println(Calculation(text));
    }
}