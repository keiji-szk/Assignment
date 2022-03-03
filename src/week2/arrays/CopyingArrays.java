package week2.arrays;

import java.util.Arrays;
import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        int ls1[] = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < ls1.length; ++i) {
            ls1[i] = rnd.nextInt(100) + 1;
        }

        int ls2[] = Arrays.copyOf(ls1, ls1.length);
        ls1[ls1.length - 1] = -7;

        System.out.print("Array 1:");
        for (int i = 0; i < ls1.length; ++i) {
            System.out.print(ls1[i] + " ");
        }

        System.out.print("\nArray 2:");
        for (int i = 0; i < ls2.length; ++i) {
            System.out.print(ls2[i] + " ");
        }
    }
}
