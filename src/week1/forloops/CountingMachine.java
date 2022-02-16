package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Count to: ");
        int num = in.nextInt();
        for(int i = 0; i < num + 1; ++i)
        {
            System.out.print(i + " ");
        }
    }
}
