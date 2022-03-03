package week2.arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int ls1[] = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < ls1.length; ++i) {
            ls1[i] = rnd.nextInt(100) + 1;
        }

        System.out.print("Array: ");
        for (int i = 0; i < ls1.length; ++i) {
            System.out.print(ls1[i] + " ");
        }

        System.out.print("\nValue to find: ");
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        for (int i = ls1.length - 1; 0 <= i; --i) {
            if (inputNum == ls1[i]) {
                System.out.println(inputNum + " is in slot " + i);
                return;
            }
        }

        System.out.println(inputNum + " is not in the array");
    }
}
