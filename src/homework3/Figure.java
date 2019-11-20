package homework3;

import java.util.Scanner;
public class Figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Input the desired height:");
        int n = sc.nextInt ();
        String s = "*";
        for (int i = 0; i < n; i ++) {
            System.out.println (s);
            s+= "*";
        }
        for (int j = 0; j < n; n --)
            System.out.println (s.substring (0, (n-1)));
    }
}