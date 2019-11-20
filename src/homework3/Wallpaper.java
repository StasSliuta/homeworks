package homework3;

import java.util.Scanner;
    public class Wallpaper {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("input the width of the picture:");
            int width = scan.nextInt();

            System.out.print("Input the number of bands:");
            int ns = scan.nextInt();

            System.out.print("Input the height of the picture:");
            int height = scan.nextInt();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < ns; j++) {

                    if (j % 2 == 0) {

                        for (int k = 0; k < width; k ++) {
                            System.out.print("+");
                        }
                    }

                    else {

                        for (int k = 0; k < width; k ++) {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
    }