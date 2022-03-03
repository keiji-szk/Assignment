package week2.arrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i) {
            ls.add(rnd.nextInt(100) + 1);
        }
        System.out.println("ArrayList: " + ls);

        System.out.print("\nValue to find: ");
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        for (int i = ls.size() - 1; 0 <= i; --i) {
            if (inputNum == ls.get(i)) {
                System.out.println(inputNum + " is in slot " + i);
                return;
            }
        }

        System.out.println(inputNum + " is not in the ArrayList");
    }
}
