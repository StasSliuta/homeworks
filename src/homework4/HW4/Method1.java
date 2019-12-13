package homework4.HW4;

public class Method1 {
    public static void maxNumber(int[] myarray) {
        int max = myarray[0];
        for (int i = 1; i < myarray.length; i++) max = Math.max(max, myarray[i]);
        System.out.println(max);
    }
}