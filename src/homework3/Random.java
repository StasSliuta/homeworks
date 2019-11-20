package homework3;

import java.util.Arrays;
public class Random {
    public static void main(String[] args) {
        int[] Numbers = new int[10];
        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(Numbers));
        int[] Numbers2 = new int[10];
        for (int i = 0; i < Numbers2.length; i++) {
            Numbers2[i] = Numbers[i] * 2;
        }
        int[] NumbersResult = new int[Numbers.length + Numbers2.length];
        System.arraycopy(Numbers, 0, NumbersResult, 0, Numbers.length);
        System.arraycopy(Numbers2, 0, NumbersResult, Numbers.length, Numbers2.length);
        System.out.println(Arrays.toString(NumbersResult));
    }
}