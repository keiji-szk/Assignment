package week2.arrays;

import java.util.Random;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int ls1[] = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < ls1.length; ++i) {
            ls1[i] = rnd.nextInt(100) + 1;
        }

        int maxVal = 0;
        System.out.print("Array: ");
        for (int i = 0; i < ls1.length; ++i) {
            System.out.print(ls1[i] + " ");
            maxVal = Math.max(maxVal, ls1[i]);
        }
        System.out.println("\n");
        System.out.println("The largest value is " + maxVal);
    }

}
