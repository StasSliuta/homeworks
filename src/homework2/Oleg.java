package homework2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Oleg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту: ");
        int a = sc.nextInt();
        System.out.println("Введите количество полос: ");
        int b = sc.nextInt();
        System.out.println("Введите ширину полос: ");
        int c = sc.nextInt();
        String j = "+";
        String pluses = String.join("", Collections.nCopies(c, j));
        String k = "*";
        String stars = String.join("", Collections.nCopies(c, k));
        String wallPapers[][] = new String[a][b];
        for (int m=0; m<wallPapers.length; m++) {
            for (int n=0; n<wallPapers[0].length; n++){
                if ((n%2) == 0) wallPapers[m][n] = pluses;
                else wallPapers[m][n] = stars;


            }
            System.out.println(Arrays.toString(wallPapers[0]));
        }

    }
}